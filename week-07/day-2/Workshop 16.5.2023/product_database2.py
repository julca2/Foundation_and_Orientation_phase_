products = {}
products['Eggs'] = 200
products['Milk'] = 200
products['Fish'] = 400
products['Apples'] = 150
products['Bread'] = 50
products['Chicken'] = 550

less_than = 201
more_than = 150
for item in products:
    if products.get(item) < less_than:
        print(item)

for item in products:
    if products.get(item) > more_than:
        print(item + " " +str(products.get(item)))

