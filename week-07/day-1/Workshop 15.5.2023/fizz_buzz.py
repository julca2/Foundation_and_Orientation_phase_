# Write a program that prints the numbers from 1 to 100
# but for multiples of three print “Fizz” instead of the number
# and for the multiples of five print “Buzz”
# For numbers which are multiples of both three and five print “FizzBuzz”
a = 1
while a<=100:
    if a%3==0 and a%5==0:
        print("FizzBuzz")
    elif a%5 ==0:
        print("Buzz")
    elif a%3 ==0:
        print("Fizz")
    else:
        print(a)
    a+=1
