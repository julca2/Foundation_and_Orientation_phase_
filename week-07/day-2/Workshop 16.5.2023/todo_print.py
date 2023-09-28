# Add "My todo:" to the beginning of the todoText
# Add " - Download games" to the end of the todoText
# Add " - Diablo" to the end of the todoText applying indention

# Expected output:

# My todo:
#  - Buy milk
#  - Download games
#      - Diablo

todoText = " - Buy milk\n"
add1 = "My todo: \n" + todoText
add2 = add1 + ' - Download games\n' + '\t - Diablo'
todoText = add2
print(todoText)
