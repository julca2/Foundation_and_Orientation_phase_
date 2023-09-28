map2 = {}

map2['978-1-60309-452-8'] = 'A Letter to Jo'
map2['978-1-60309-459-7'] = 'Lupus'
map2['978-1-60309-444-3'] = 'Red Panda and Moon Bear'
map2['978-1-60309-461-0'] = 'The Lab'

for k, v in map2.items():
    print(v + " (" + k + ')')


map2.pop('978-1-60309-444-3')

map2.popitem()


map2['978-1-60309-450-4'] = 'They Called Us Enemy'
map2['978-1-60309-453-5'] = 'Why Did We Trust Him?'

if map2.get('478-0-61159-424-8'):
    print(True)
else:
    print(False)

print(map2.get('978-1-60309-453-5'))