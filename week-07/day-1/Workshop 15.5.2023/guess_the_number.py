# Write a program that stores a number and the user has to figure it out.
# The user can input guesses. After each guess the program responds
# with a message indicating whether the stored number is smaller or
# greater than the guess.
# The program ends (exits) when the user finds the stored number
#
# Example:
#
# Please enter your guess: 3
# The stored number is greater than 3
# Please enter your guess: 10
# The stored number is smaller than 10
# Please enter your guess: 8
# You have found the stored number 8
#
stored_number = 8
inp = input("Please enter your guess: ")
while int(inp) != stored_number:
    if int(inp) < stored_number:
     print("The stored number is greater than " + inp)
    elif int(inp) > stored_number:
        print("The stored number is smaller than " + inp)
    inp = input("Please enter your guess: ")

print("You have found the stored number " + inp)