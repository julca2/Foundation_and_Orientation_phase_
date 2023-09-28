# Create a program that asks for two numbers. If the second number
# is not greater than the first the program should print:
# "The second number should be bigger"
#
# Otherwise it should output all integers between the first and
# the second number (excluding the second number)
#
# Example:
#
# Please enter the first number: 3
# Please enter the second number: 6
# 3
# 4
# 5

a = input("Please enter a number: ")
b = input("Please enter a number: ")

if int(b)<int(a):
    print("The second number should be bigger")
else:
    c = int(a)
    while c< int(b):
        print(c)
        c+=1