# Write a function called countLines() that takes a filename as string as a parameter
# and  returns the number of lines the file contains.
# It should return zero if it can't open the file and
# should not raise any error.

def count_lines(filename):
    counter = 0
    try:
        my_file = open(filename, 'r')
        for line in my_file:
            counter += 1
        return counter
    except IOError:
        return counter


print(count_lines('file-name.txt'))

print(count_lines('i_do_not_exist.txt'))


