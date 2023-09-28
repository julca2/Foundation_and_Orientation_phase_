# Write a function that copies the contents of a file into another file
# It should take two filenames as parameters
# It should return a boolean that shows if the copy was successful

def copy(filename, filename2):
    try:
        file_to_copy = open(filename, 'r')
        file_to_paste = open(filename2, 'w')
        for line in file_to_copy:
            file_to_paste.write(line)
        return True
    except IOError:
        return False


copy('apple_text.txt', 'new_apple_text.txt')