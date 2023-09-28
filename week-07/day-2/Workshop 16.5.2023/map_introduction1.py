empty_map = {}
if len(empty_map) == 0:
    print('Map is empty')
else:
    print('Map is not empty')

empty_map[97] = 'a'
empty_map[98] = 'b'
empty_map[99] = 'c'
empty_map[65] = 'A'
empty_map[66] = 'B'
empty_map[67] = 'C'

print(empty_map.keys())
print(empty_map.values())

empty_map[68] = 'D'

print(len(empty_map))
print(empty_map.get(99))

empty_map.pop(97)

if empty_map.get(100):
    print(True)
else:
    print(False)

empty_map.clear()
print(len(empty_map))

