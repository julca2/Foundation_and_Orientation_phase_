/*

    Write a query that returns all the orders and match them with persons 
    who picked up the order.

    Return only those orders that were placed in March 2014.

    | OrderID | FullName |
    ----------------------

    What do you see in the resultset?

    How do you display only those rows that don't match?

    How can you make the original query look like an INNER JOIN with a 
    WHERE predicate?

*/

/*

    Apply a filter in your original query that filters for full names that 
    start with 'Hudson'.

    What do you notice?

*/

select OrderID, c.CustomerName as FullName
from Sales.Orders o
left outer join Sales.Customers c on o.PickedByPersonID=c.CustomerID
where  year(o.OrderDate) = 2014 and MONTH(o.OrderDate)=3

select OrderID, c.CustomerName as FullName
from Sales.Orders o
join Sales.Customers c on o.PickedByPersonID=c.CustomerID 
where o.PickedByPersonID != c.CustomerID 

