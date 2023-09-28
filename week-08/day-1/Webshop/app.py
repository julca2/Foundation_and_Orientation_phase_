from flask import Flask, render_template, request
import pyodbc

app = Flask(__name__)

try:
    connect = pyodbc.connect(
        "DRIVER={ODBC Driver 17 for SQL Server};"
        "SERVER=localhost;"
        "DATABASE=GFA_DE;"
        "Trusted_Connection=yes;"
    )

    print('Successfully connected to DB!')

    cursor = connect.cursor()


#main page
    @app.route('/webshop')
    def display_items():
        cursor.execute("SELECT * FROM webshop")
        out = cursor.fetchall()
        d_selection = {Name: (Description, Price, Quantity) for (Name, Description, Price, Quantity) in out}
        return render_template('webshop.html', webshopDatas=d_selection)

#only available button function
    @app.route('/only-available')
    def display_available():
        cursor.execute("SELECT * FROM webshop WHERE Quantity > 0 ")
        out = cursor.fetchall()
        d_selection = {Name: (Description, Price, Quantity) for (Name, Description, Price, Quantity) in out}
        return render_template('webshop.html', webshopDatas=d_selection)

#cheapest first button function
    @app.route('/cheapest-first')
    def display_cheapest():
        cursor.execute("SELECT * FROM webshop ORDER BY Price")
        out = cursor.fetchall()
        d_selection = {Name: (Description, Price, Quantity) for (Name, Description, Price, Quantity) in out}
        return render_template('webshop.html', webshopDatas=d_selection)

#contains nike button function
    @app.route('/contains-nike')
    def display_nike():
        cursor.execute("SELECT * FROM webshop WHERE Description Like '%Nike%'")
        out = cursor.fetchall()
        d_selection = {Name: (Description, Price, Quantity) for (Name, Description, Price, Quantity) in out}
        return render_template('webshop.html', webshopDatas=d_selection)

#average stock button function
    @app.route('/average-stock')
    def display_average_stock():
       cursor.execute("SELECT AVG(CAST(Quantity as FLOAT)) FROM webshop")
       out = cursor.fetchone()[0]
       print(out)
       text = 'Average stock: '
       return render_template('infos.html', Text=text, avg=out)

#most expensive button function
    @app.route('/most-expensive')
    def display_most_expensive_available():
        cursor.execute("SELECT TOP 1 * FROM webshop WHERE Quantity > 0 ORDER BY Price desc")
        out = cursor.fetchone()
        out = out[0]
        return render_template('infos.html', avg=out)

#search field function
    @app.route('/search', methods=['POST'])
    def search_item():
        title = request.form['title']
        cursor.execute("SELECT * FROM webshop WHERE Description LIKE '%'+?+'%' OR Name LIKE '%'+?+'%'", (title, title))
        out = cursor.fetchall()
        d_selection = {Name: (Description, Price, Quantity) for (Name, Description, Price, Quantity) in out}
        return render_template('webshop.html', webshopDatas=d_selection)


    if __name__ == '__main__':
        app.run()

except pyodbc.ProgrammingError as e:
    print(e)
    print('Something wrong with SQL statement')
except pyodbc.InterfaceError as e:
    print('Something is wrong with the driver / wrong DB name')
except pyodbc.OperationalError as e:
    print('SQL connection error')
