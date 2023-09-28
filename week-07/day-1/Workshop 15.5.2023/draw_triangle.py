# Write a program that reads a number from the standard input and
# then draws a triangle of the specified height
#
# Example:
#
# Please enter the triangle height: 4
# *
# **
# ***
# ****

b = 1
a = input("Please enter a number: ")
while b <= int(a):
    print(b*"*")
    b+=1