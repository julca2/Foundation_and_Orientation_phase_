telephone_book = {}

telephone_book['William A. Lathan'] = '405-709-1865'
telephone_book['John K. Miller'] = '402-247-8568'
telephone_book['Hortensia E. Foster'] = '606-481-6467'
telephone_book['Amanda D. Newland'] = '319-243-5613'
telephone_book['Brooke P. Askew'] = '307-687-2982'

print(telephone_book.get('John K. Miller'))

value = {i for i in telephone_book if telephone_book[i] == '307-687-2982'}
print(value)


if telephone_book.get('Chris E. Myers'):
    print('yes')
else:
    print('no')

