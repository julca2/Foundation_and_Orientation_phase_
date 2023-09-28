/*

    Write a query that returns all the customer IDs from orders and match the 
    orders with persons who picked up the order.

    Return only those orders that were placed in March 2014.
    Make customer groups and count how many persons there are in each group.

    | CustomerID | cnt_persons |
    ----------------------------

    Watch out for using the COUNT function!
    How should you use the COUNT function? Why?

*/

select o.CustomerID, count(o.CustomerID) as cnt_persons
from Sales.Orders o
join Sales.Orders so on so.CustomerID = o.PickedByPersonID
where  year(o.OrderDate) = 2014 and MONTH(o.OrderDate)=3
group by o.CustomerID

