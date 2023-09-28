from airflow import DAG
from datetime import datetime
from airflow.operators.bash import BashOperator
from airflow.operators.python import PythonOperator
from airflow.operators.python import BranchPythonOperator
from airflow.models import Variable



default_args = {
    'owner': 'airflow',
    'depends_on_past': False,
    'start_date': datetime(2023, 5, 23)
}

# first dag functions
def sample_func1():
    print("I am a result of a PythonOperator!!!")

def sample_func2(*op_args):
    for i in op_args:
        print(i)

def sample_xcom_func():
    return [
        [0, 22, "Michael"],
        [0, 27, "Julia"],
        [0, 65, "Greg"]
    ]

def sample_xcom_pull_func(ti):
    data = ti.xcom_pull(task_ids=['xcom_sample'])
    return data[0]

def get_variable():
    my_var = Variable.get("url")
    print(my_var)

# second dag functions - how to do branching
def pos():
    return 'Positive'

def neg():
    return 'Negative path'

def branch():
    var = int(Variable.get("decisionmaker"))
    if var > 10:
        return 'pos'
    else:
        return 'neg'

# dag definition
my_second_dag = DAG(
    'my_second_dag',
    schedule_interval='@daily',
    default_args=default_args
)

mydag = DAG(
    'adag',
    schedule_interval='@daily',
    default_args=default_args
)

my_first_py_task = PythonOperator(task_id='my_first_py_task', python_callable=sample_func1, dag=my_second_dag)
my_second_py_task = PythonOperator(task_id='my_second_py_task', python_callable=sample_func2, op_args=[0,1,2,3], dag=my_second_dag)
my_third_py_task = PythonOperator(task_id='xcom_sample', python_callable=sample_xcom_func, dag=my_second_dag)
my_fourth_py_task = PythonOperator(task_id='xcom_pull', python_callable=sample_xcom_pull_func, dag=my_second_dag)
my_fifth_py_task = PythonOperator(task_id='my_fifth_py_task', python_callable=get_variable, dag=my_second_dag)

my_first_py_task >> [my_second_py_task, my_third_py_task] >> my_fourth_py_task >> my_fifth_py_task

# task definitions for branching dag
branch = BranchPythonOperator(task_id='branch', python_callable=branch, dag=mydag)
pos = PythonOperator(task_id='pos', python_callable=pos, dag=mydag)
neg = PythonOperator(task_id='neg', python_callable=neg, dag=mydag)

branch >> [pos, neg]

'''
default_args = {
    'owner': 'airflow',
    'depends_on_past': False,
    'start_date': datetime(2023, 5, 23)
}

initial = DAG(
    'initial',
    schedule_interval='0 4 * * 1-5',
    default_args=default_args
)

email = EmailOperator(
        task_id='send_email',
        email_on_failure ='julca.baumgartnerova@gmail.com',
        subject='Airflow Alert',
        html_content=""" <h3> Email Test</h3> """,
        dag=dag
)

'''





