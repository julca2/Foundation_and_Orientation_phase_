# Write a program that stores 3 sides of a cuboid as variables (float)
# The program should write the surface area and volume of the cuboid.
#
# Set the 3 sides to 10.4, 13.5, 8.2 and your program should
# produce the following output:
#
# Surface Area: 672.76
# Volume: 1151.28

a = 10.4
b = 13.5
c = 8.2

volume = a*b*c
area = 2*((a*b)+(b*c)+(a*c))

print("Surface area: " + str(area))
print("Volume: " + str(volume))
