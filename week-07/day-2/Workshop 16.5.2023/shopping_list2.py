prices = {}
prices['Milk'] = 1.07
prices['Rice'] = 1.59
prices['Eggs'] = 3.14
prices['Cheese'] = 12.60
prices['Chicken Breasts'] = 9.40
prices['Apples'] = 2.31
prices['Tomato'] = 2.58
prices['Potato'] = 1.75
prices['Onion'] = 1.10

Bob = {}
Bob['Milk'] = 3
Bob['Rice'] = 2
Bob['Eggs'] = 2
Bob['Cheese'] = 1
Bob['Chicken Breasts'] = 4
Bob['Apples'] = 1
Bob['Tomato'] = 2
Bob['Potato'] = 1

Alice = {}
Alice['Rice'] = 1
Alice['Eggs'] = 5
Alice['Chicken Breasts'] = 2
Alice['Apples'] = 1
Alice['Tomato'] = 10

value_Bob = 0
for item in prices:
    if item in Bob:
        value_Bob = value_Bob + (prices.get(item)*Bob.get(item))
print(value_Bob)

value_Alice = 0
for item in prices:
    if item in Alice:
        value_Alice = value_Alice + (prices.get(item)*Alice.get(item))
print(value_Alice)

if Alice.get('Rice') > Bob.get('Rice'):
    print('Alice')
else:
    print('Bob')

try:
    if Alice.get('Potato') > Bob.get('Potato'):
        print('Alice')
    else:
        print('Bob')
except:
    print('Bob')

try:
    if Alice.get('Ham') > Bob.get('Ham'):
        print('Alice')
    else:
        print('Bob')
except:
    print('no one')

try:
    if Alice.get('Apple') > Bob.get('Apple'):
        print('Alice')
    else:
        print('Bob')
except:
    print('no one')

if len(Alice) > len(Bob):
    print('Alice')
else:
    print('Bob')

count_Bob = 0
for item in Bob:
    count_Bob = count_Bob+(Bob.get(item))

count_Alice = 0
for item in Alice:
    count_Alice = count_Alice + (Alice.get(item))

if count_Alice > count_Bob:
    print('Alice')
else:
    print('Bob')