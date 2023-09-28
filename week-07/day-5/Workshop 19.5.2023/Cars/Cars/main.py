import pyodbc
import json

json_data = open('cars.json').read()
json_obj = json.loads(json_data)

try:
    connect = pyodbc.connect(
        "DRIVER={ODBC Driver 17 for SQL Server};"
        "SERVER=MSI;"
        "DATABASE=GFA_DE;"
        "Trusted_Connection=yes;"
    )

    cursor = connect.cursor()

    for item in json_obj:
        id = item.get("id")
        brand = item.get("brand")
        model = item.get("model")
        year = item.get("year")
        xcondition = item.get("condition")
        price = item.get("price")
        count = item.get("count")
        cursor.execute("INSERT INTO json_file(id, brand, model, year, xcondition, price, count) values (?, ?, ?, ?, ?, ?, ?)", (id, brand, model, year, xcondition, price, count))

    connect.commit()
    connect.close()

except pyodbc.ProgrammingError as e:
    print(e)
    print('Something wrong with SQL statement')
except pyodbc.InterfaceError as e:
    print('Something is wrong with the driver / wrong DB name')
except pyodbc.OperationalError as e:
    print('SQL connection error')