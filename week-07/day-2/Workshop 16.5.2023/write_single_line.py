# Write a function that is able to manipulate a file
# by writing your name into it as a single line.
# The file should be named "my-file.txt".
# In case the program is unable to write the file,
# it should print the following error message: "Unable to write file: my-file.txt"

def write_name_into_file(filename, name):
    try:
        my_file = open(filename, 'w')
        my_file.write(name)
    except IOError:
        print("Unable to write file: " + filename)


write_name_into_file('my-file.txt', 'Jul')

