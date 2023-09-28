# Write a program that reads a number from the standard input,
# then prints "Odd" if the number is odd, or "Even" if it is even
#
# Please enter a number: 7
# Odd # neparny

a = input("Please enter a number: ")
if int(a)%2 == 0:
    print("Even")
else:
    print("Odd")