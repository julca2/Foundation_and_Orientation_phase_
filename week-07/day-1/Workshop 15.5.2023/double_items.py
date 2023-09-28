# - Create an array variable named `numbers`
#   with the following content: `[3, 4, 5, 6, 7]`
# - Double all the values in the array and print the modified
#   array to the console as:
#   [6, 8, 10, 12, 14]


numbers = [3, 4, 5, 6, 7]

doubled_numbers = []
for number in numbers:
    doubled_numbers.append(number+number)
print(doubled_numbers)
