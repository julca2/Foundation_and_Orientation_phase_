from airflow import DAG
from datetime import datetime
import requests
import pandas as pd
import numpy as np
from pymongo import MongoClient
from airflow.operators.python import PythonOperator
from airflow.providers.microsoft.mssql.hooks.mssql import MsSqlHook
from airflow.providers.microsoft.mssql.operators.mssql import MsSqlOperator
default_args = {
    'owner': 'airflow',
    'start_date': datetime(2023, 6, 13)
}
#json instead of csv
'''
import requests
import json
import pandas as pd
from pandas import json_normalize

data = requests.get("http://127.0.0.1:5000/api/products")
data1 = data.json()
df = pd.DataFrame.from_dict(pd.json_normalize(data1), orient='columns')
print(df)
'''
a_etl_dag = DAG(
    "a_etldag",
    schedule='@weekly',
    default_args=default_args
)

def read_transform():
# read je len jeden riadok, nema vyznam na to robit zvlast funkciu
    df = pd.read_csv(r"https://raw.githubusercontent.com/ejmyyy/gfa-applicants-data/main/dataset.csv")
#vymaze duplicity
    df = df.drop_duplicates()
#   df.drop_duplicates(inplace=True) - rovnake ako riadok vyssie
#vyplni prazdne miesta slovom 'Unknown', tiez sa da pouzit inplace
    df = df.fillna('Unknown')
    df = df.loc[df['Cognitive-score']>=50]
#vytvori novy stlpec kde PL je java = Panthera, inak Celadon
    df['Class-name'] = np.where(df['Preffered-language'] == 'Java', 'Panthera', 'Celadon')
    return df.values.tolist()
#mozno to bude treba vratit ako list, preco? preco nie?

'''
CREATE TABLE? 2p
do komentaru, alebo prilozit sql ako som vytvorila table
ak to nestihnem obalit do hooku
'''
def load_applicants(ti):
    # task musi byt nazov funkcie z ktorej udaje beriem
    data = ti.xcom_pull(task_ids=['read_transform'])[0]
    #vytvorim si z listu novy df bez id a pridam class id
    df = pd.DataFrame(data,
                      columns=['name_surname', 'age', 'address', 'preferred_language', 'cognitive_score', 'class_id'])
    #upravim df ako pri transforme
    df['class_id'] = np.where(df['class_id'] == 'Panthera', 1, 2)
    df['class_id'] = df['class_id'].astype(int)
    #df na list
    result = df.values.tolist()
    #hook - id vytvorene na AIRFLOW
    hook = MsSqlHook(mssql_conn_id='sqlserver')
    # tabulka, list, a ktore stlpce v tabulke
    hook.insert_rows('trialexam.dbo.applicants', result,
                     target_fields=['name_surname', 'age', 'address', 'preferred_language', 'cognitive_score',
                                    'class_id'])
    return 0



read_transform = PythonOperator(task_id='read_transform', python_callable=read_transform, dag=a_etl_dag)
load_applicants = PythonOperator(task_id='load_applicants', python_callable=load_applicants, dag=a_etl_dag)


read_transform >> load_applicants