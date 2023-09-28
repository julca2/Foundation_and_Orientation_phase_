# - Create a function called `calculateFactorial()`
#   that returns the factorial of its input
#
# - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
import sys


def calculate_factorial(number):
    x = 1
    y = 1
    while x <= number:
        y = x*y
        sys.stdout.write(str(x))
        if x < number:
            sys.stdout.write(" + ")
        x += 1
    sys.stdout.write(" = " + str(y))


calculate_factorial(5)
