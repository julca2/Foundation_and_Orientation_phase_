# Write a function called `sum()` that returns the sum of numbers
# from zero to the given parameter
#
# Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15
import sys


def sum(number):
    x = 0
    y = 0
    while x <= number:
        y = x + y
        sys.stdout.write(str(x))
        x += 1
        if x<=number:
            sys.stdout.write(" + ")
    print(" = " + str(y))

sum(5)