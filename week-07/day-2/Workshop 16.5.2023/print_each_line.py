# Write a program that opens a file called "my-file.txt" and prints
# each line from the file.
# If the program is unable to read the file (for example it does not exist),
# it should print the following error message: "Unable to read file: my-file.txt"

def open_file(filename):
    try:
        my_file = open(filename, 'r')
        for line in my_file:
            print(line.rstrip())
    except IOError:
        print("Unable to read file: " + filename)


open_file('file-name.txt')

open_file('i_do_not_exist.txt')