# - Create a variable named `typo` and assign the value `Chinchill` to it
# - Write a function called `append_a()` that gets a string as an input,
#   appends an 'a' character to its end and returns with a string
# - Print the result of `append_a(typo)`

typo = 'Chinchill'


def append_a(string):
    my_string = "a"
    return string+my_string


print(append_a(typo))