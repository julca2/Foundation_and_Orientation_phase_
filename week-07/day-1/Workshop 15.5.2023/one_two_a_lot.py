# Write a program that reads a number form the standard input,
# If the number is zero or smaller it should print: Not enough
# If the number is one it should print: One
# If the number is two it should print: Two
# If the number is more than two it should print: A lot
#
# Example
#
# Please enter a number: 5
# A lot

a = input("Please enter a number: ")
if int(a)<0:
    print("Not enough")
elif int(a)==1:
    print("One")
elif int(a)==2:
    print("Two")
else:
    print("A lot")