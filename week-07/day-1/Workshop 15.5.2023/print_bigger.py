# Write a program that asks for two numbers and prints the bigger one.
# If they are equal, it prints the second one.
#
# Example
#
# Please enter a number: 5
# Please enter a number: 13
# 13

a = input("Please enter a number: ")
b = input("Please enter a number: ")

if int(a)>int(b):
    print(a)
else:
    print(b)