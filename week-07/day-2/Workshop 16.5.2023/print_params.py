# - Create a function called `print_params`
#   which prints the input parameters
#   (can have multiple number of arguments)

def print_params(*printing):
    print(printing)

hello = "hello"
hi = "hi"
print_params(hello, hi)