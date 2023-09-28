'''import pyodbc
from airflow import DAG
from datetime import datetime
from airflow.providers.microsoft.mssql.hooks.mssql import MsSqlHook
from airflow.providers.microsoft.mssql.operators.mssql import MsSqlOperator


def insert_mssql_hook():
    mssql_hook = MsSqlHook(mssql_conn_id="airflow_mssql", schema="airflow")

default_args = {
    'start_date': datetime(2023, 6, 9)
}

connect = pyodbc.connect(
    "DRIVER={ODBC Driver 17 for SQL Server};"
    "SERVER=localhost;"
    "DATABASE=GFA_EXAM;"
    "Trusted_Connection=yes;"
)
cursor = connect.cursor()

cognitive = MsSqlOperator(
    task_id="cognitive_scores",
    mssql_conn_id="airflow_mssql",
    sql='''SELECT avg(cognitive score) as avg_cognitive_score, min(cognitive score) as min_cognitive_score, max(cognitive score) as max_cognitive_score
    FROM applicants
    GROUP BY Preffered-language
    '''
)

age = MsSqlOperator(
    task_id="age",
    mssql_conn_id="airflow_mssql",
    sql='''SELECT [name and surname] 
    FROM applicants
    WHERE age < 66 and age > 34
    '''
)

top3=MsSqlOperator(
    task_id="cognitive_scores",
    mssql_conn_id="airflow_mssql",
    sql='''SELECT TOP 3 max(cognitive score), programming language 
    FROM applicants
    GROUP BY cognitive score, programming language 
    '''
)

oldest=MsSqlOperator(
    task_id="cognitive_scores",
    mssql_conn_id="airflow_mssql",
    sql='''SELECT [name and surname], max(age)
    FROM applicants a
    join classes c ON a.classid = c.classid
    GROUP BY programming language, className, [name and surname], age
    '''
)

sql_queries= DAG(
    'sqlqueries',
    default_args=default_args
)


'''
