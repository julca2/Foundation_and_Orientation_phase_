products = {}
products['Eggs'] = 200
products['Milk'] = 200
products['Fish'] = 400
products['Apples'] = 150
products['Bread'] = 50
products['Chicken'] = 550

fish = products.get('Fish')
print(fish)

most_expensive = ' '
cost = 0
for item in products:
    if products.get(item) > cost:
        cost = products.get(item)
        most_expensive = item

print(most_expensive)

average = 0
for item in products:
    average = average+products.get(item)

average = average/len(products)
print(average)

money = 125
if money in products.values():
    print('yes')
else:
    print('no')


cheapest = ''
cost = 10000
for item in products:
    if products.get(item) < cost:
        cost = products.get(item)
        cheapest = item

print(cheapest)
