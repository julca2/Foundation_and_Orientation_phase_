# Create a function that divides number 10
# by a number that's passed as a paramater and prints the result.
# It should print "fail" if the parameter is 0

def divide_ten(parameter):
    if parameter == 0:
        print("fail")
    else:
        print(10/parameter)

divide_ten(5)
divide_ten(0)


def new_divide_ten(parameter):
    try:
        result = 10/parameter
        print(result)
    except ZeroDivisionError:
        print("fail")

new_divide_ten(5)
new_divide_ten(0)