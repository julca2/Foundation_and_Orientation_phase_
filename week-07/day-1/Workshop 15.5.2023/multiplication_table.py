# Create a program that asks for a number and prints the multiplication table with that number
#
# Example:
# The number 15 should print:
#
# 1 * 15 = 15
# 2 * 15 = 30
# 3 * 15 = 45
# 4 * 15 = 60
# 5 * 15 = 75
# 6 * 15 = 90
# 7 * 15 = 105
# 8 * 15 = 120
# 9 * 15 = 135
# 10 * 15 = 150

a = 1
inp = input("Please enter a number: ")
while a<=10:
    c=a*int(inp)
    print(str(a) + " * " + str(inp) + " = " + str(c))
    a+=1