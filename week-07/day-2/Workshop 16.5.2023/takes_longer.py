# When saving this quote a disk error has occured. Please fix it!
# Insert the words "always takes longer than" between the words "It" and "you"!

quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law."
add = "always takes longer than "
new_quote = quote[:21] + add + quote[21:]
quote=new_quote
print(quote)