# Write a program that asks for two integers
# The first represents the number of chickens the farmer has
# The second represents the number of pigs owned by the farmer
# Print how many legs all the animals have in total
#
# Example
#
# Please enter the number of chickens: 4
# Please enter the number of pigs: 2
# The number of legs: 16

chickens = input("Please enter the number of chickens: ")
pigs = input("Please enter the number of pigs: ")
legs = (int(chickens)*2)+(int(pigs)*4)
print(legs)