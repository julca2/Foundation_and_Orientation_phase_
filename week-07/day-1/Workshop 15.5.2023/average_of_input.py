# Write a program prompts the user for 5 integers in a row,
# then it prints their sum and their average:
#
# Please enter a number: 3
# Please enter a number: 7
# Please enter a number: 1
# Please enter a number: 6
# Please enter a number: 5
# Sum: 22, Average: 4.4

a = input("Please enter a number: ")
b = input("Please enter a number: ")
c = input("Please enter a number: ")
d = input("Please enter a number: ")
e = input("Please enter a number: ")
sum = int(a) + int(b) + int(c) + int(d) + int(e)
average = sum/5

print("Sum: " + str(sum) + " Average: " + str(average))

