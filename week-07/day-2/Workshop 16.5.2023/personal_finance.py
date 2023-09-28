list = [500, 1000, 1250, 175, 800, 120]

we_spend = 0
for i in list:
    we_spend = we_spend + i

print(we_spend)

greatest_expense = 0

for i in list:
    if i > greatest_expense:
        greatest_expense = i

print(greatest_expense)

cheapest_spending = 1000000
for i in list:
    if i < cheapest_spending:
        cheapest_spending = i

print(cheapest_spending)

average_amount = 0
for i in list:
    average_amount = average_amount + i
average_amount = average_amount/len(list)

print(average_amount)