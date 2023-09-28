# Write a program which prompts the user for a double value
# specifying a distance in miles, converts that value
# to kilometers and prints it
#
# Example:
#
# Please enter a distance in miles: 1.8
# The distance in km: 2.88
#

distance_in_miles = input("Please enter a distance in miles: ")
distance_in_kms = float(distance_in_miles)*1.6
print(distance_in_kms)