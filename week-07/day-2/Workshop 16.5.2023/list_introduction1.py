names = []
print(len(names))
names.append('William')

if len(names) == 0:
    print(True)
else:
    print(False)

names.append('John')
names.append('Amanda')

print(len(names))
print(names[2])

for name in names:
    print(name)

x = 1
for name in names:
    name = str(x) + ". " + name
    x += 1
    print(name)

names.pop(1)
names.reverse()
for name in names:
    print(name)

names.clear()
print(len(names))
