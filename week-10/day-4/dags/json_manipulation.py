import requests
import json
import pandas as pd
from pandas import json_normalize
'''
response = requests.get("http://127.0.0.1:5000/api/products")
dictr = response.json()
df = pd.json_normalize(dictr)
print(df.head())


data = pd.read_json("http://127.0.0.1:5000/api/products")
df = pd.json_normalize(data)
print(df)
'''

'''
data = requests.get("http://127.0.0.1:5000/api/products")
data1 = data.json()
df = pd.DataFrame(data1)

print(df)

data = requests.get("http://127.0.0.1:5000/api/products")
data1 = data.json()
df=pd.json_normalize(data1)
print(df)

print('---------------------')
data = requests.get("https://opensource.adobe.com/Spry/data/json/donuts.js")
data1 = data.json()
df = pd.DataFrame.from_dict(pd.json_normalize(data1), orient='columns')
print(df)
'''
print('---------------------')
data = requests.get("https://dummyjson.com/test")
print(type(data))
df = data.json()
print(df)

print('---------------------')

data = requests.get("https://dummyjson.com/test")
data1 = data.json()
print(type(data1))
df = pd.DataFrame.from_dict(pd.json_normalize(data1), orient='columns')
print(df)

print('---------------------')
data = requests.get("https://opensource.adobe.com/Spry/data/json/donuts.js")
df = pd.DataFrame.from_dict(pd.json_normalize(data), orient='columns')
print(df)


listOfDict = [{'Name': 'Aditya', 'Roll': 1, 'Language': 'Python'}, {'Name': 'Sam', 'Roll': 2, 'Language': 'Java'},
              {'Name': 'Chris', 'Roll': 3, 'Language': 'C++'}, {'Name': 'Joel', 'Roll': 4, 'Language': 'TypeScript'}]
print("THe list of dictionaries is:")
print(listOfDict)
df = pd.DataFrame.from_dict(listOfDict)
print("The dataframe is:")
print(df)









