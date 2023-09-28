from airflow import DAG
from datetime import datetime
from airflow.operators.python import PythonOperator
from airflow.models import Variable
from airflow.operators.python import BranchPythonOperator
from airflow.operators.trigger_dagrun import TriggerDagRunOperator

default_args={
    'start_date': datetime(2023,5,25)
}


def hello_world():
    print('Hello World')

def print_from_variable():
    hello_var = Variable.get("hello_text")
    print(hello_var)

initial = DAG(
    'initial',
    schedule_interval='0 14 * * 1-5',
    default_args=default_args
)

initial_py_task = PythonOperator(task_id = 'initial', python_callable = hello_world, dag = initial)
print_text = PythonOperator(task_id = 'print_hello', python_callable = print_from_variable, dag = initial)

print_text>>initial_py_task

def push_xcom(ti):
    ti.xcom_push(key='first_xcom', value='Hello Xcom!')
    
def pull_xcom(ti):
    data = ti.xcom_pull(key='first_xcom', task_ids=['xcom1'])
    print(data)

xcom_dag = DAG(
    'xcom_dag',
    schedule_interval='@daily',
    default_args=default_args
)

xcom1 = PythonOperator(task_id = 'xcom1', python_callable = push_xcom, dag = xcom_dag)
xcom2 = PythonOperator(task_id = 'xcom2', python_callable = pull_xcom, dag = xcom_dag)

xcom1 >> xcom2

def odd():
    return 'odd'

def even():
    return 'even'

def xcom_num(**kwargs):
    kwargs['ti'].xcom_push(key='branch_num', value= 3)



def branch_num(**kwargs):
    var = int(kwargs['ti'].xcom_pull(key='branch_num'))
    print(var)
    if var % 2==0:
        return 'even'
    else:
        return 'odd'

branchdag = DAG(
    'branchdag',
    schedule_interval='@daily',
    default_args=default_args
)

branch = BranchPythonOperator(task_id='branch', python_callable=branch_num, dag=branchdag)
odd = PythonOperator(task_id='odd', python_callable=odd, dag=branchdag)
even = PythonOperator(task_id='even', python_callable=even, dag=branchdag)
xcom3 = PythonOperator(task_id='xcom3', python_callable=xcom_num, dag=branchdag)

xcom3 >> branch >> [odd, even]

