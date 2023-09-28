list_A = ['Apple', 'Avocado', 'Blueberries', 'Durian', 'Lychee']
list_B = ['Apple', 'Avocado', 'Blueberries', 'Durian', 'Lychee']

for item in list_A:
    if item == 'Durian':
        print(True)

list_B.remove('Durian')
list_A.insert(4, 'KiwiFruit')

print(len(list_A))
print(len(list_B))

if len(list_A) > len(list_B):
    print("List A contains more elements")
else:
    print("List B contains more elements")

print(list_A.index('Avocado'))

try:
    print(list_B.index('Durian'))
except ValueError:
    print("-1")

list_B.extend(['Passion Fruit', 'Pomelo'])

print(list_A[2])

print(list_A)
print(list_B)