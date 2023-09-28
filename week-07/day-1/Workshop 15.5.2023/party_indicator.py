# Write a program that asks for two numbers
# The first number represents the number of girls that comes to a party, the
# second represents the number of boys
#
# If the number of girls and boys are equal and 20 or more people
# are coming to the party, it should print: The party is excellent!
#
# If there are 20 or more people coming to the party
# but the girl - boy ratio is not 1-1, it should print: Quite a cool party!
#
# If there are fewer than 20 people coming,
# it should print: Average party...
#
# If no girls are coming, regardless the count of the people,
# it should print: Sausage party
#
# Please enter the number of girls: 15
# Please enter the number of boys: 25
# Quite a cool party!

girls = input("Please enter a number of girls: ")
boys = input("Please enter a number of boys: ")

if int(girls) == int(boys) and int(girls)+int(boys) > 20:
    print("The party is excellent!")
elif int(girls) == 0:
    print("Sausage party")
elif int(girls)+int(boys) > 20:
    print("Quite a cool party!")
elif int(boys)+int(girls)<20:
    print("Average party...")
