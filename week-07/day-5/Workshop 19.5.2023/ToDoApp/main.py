import pyodbc

try:
    connect = pyodbc.connect(
        "DRIVER={ODBC Driver 17 for SQL Server};"
        "SERVER=localhost;"
        "DATABASE=GFA_DE;"
        "Trusted_Connection=yes;"
    )

    print('Successfully connected to DB!')

    # create cursor
    cursor = connect.cursor()

    cursor.execute("SELECT * FROM todosForApp")

# ukazuje moznosti po otvoreni programu
    def display_options():
        print('Welcome to todo app!')
        print("-l Show the list of Todos")
        print("-a Add a new todo")
        print("-c Check task")
        print("-r Remove the task")

# zoberie si moznost ktoru ide pouzit
    def get_user_input():
        return input("What would you like to do? ")

# -l a po kazdej uprave zobrazi tabulku
    def display_todos():
        for row in cursor.fetchall():
            print(row)

# -a prida novy riadok do databazy, cislo podla dlzky kurzora + input od usera
    def add_todo():
        new_todo = input("What would you like to add? ")
        rows = cursor.fetchall()
        new_id = len(rows)+1
        todo = new_todo
        cursor.execute("INSERT INTO todosForApp (ID, Todo) VALUES(?,?)", (new_id, todo))

        print('Todo successfully added! \n')
        display_todos()

# -r vymaze riadok ktory ma id podla inputu od usera
    def remove_todo():
        todo_to_remove = input("Which number would you like to remove?")
        cursor.execute("DELETE FROM todosForApp WHERE ID =?", (int(todo_to_remove)))
        # ak ho chcem nakrmit premennou pouzivam tento format xx =?", (premenna)
        print('Todo successfully removed! \n')
        display_todos()

# - c upravi check z [] na [x] v tabulke v riadku ktory = input od usera
    def check_todo():
        todo_to_check = input("Which one you have done?")
        cursor.execute("UPDATE todosForApp SET [Check] = '[x]' WHERE ID =?", (int(todo_to_check)))
        print('Good job! \n')
        display_todos()

# samotny program
    display_options()
    choice = get_user_input()

    if choice == '-l':
        display_todos()
    elif choice == '-a':
        add_todo()
    elif choice == '-c':
        check_todo()
    elif choice == '-r':
        remove_todo()
# ----------------------------------------------
    cursor.close()

    connect.commit()

except pyodbc.ProgrammingError as e:
    print(e)
    print('Something wrong with SQL statement')
except pyodbc.InterfaceError as e:
    print('Something is wrong with the driver / wrong DB name')
except pyodbc.OperationalError as e:
    print('SQL connection error')
