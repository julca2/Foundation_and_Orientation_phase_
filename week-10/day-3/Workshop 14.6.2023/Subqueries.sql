/* 

    Modify the below query:
     - to return only the last day orders in general from the Sales.Orders table

    | CustomerID | OrderID | OrderDate |
    ------------------------------------

*/
SELECT CustomerID, OrderID, OrderDate 
FROM Sales.Orders
Where OrderDate=(
	Select MAX(OrderDate)
	from Sales.Orders)

	/* 

    Modify the below query:
     - to return the orders that each customer placed on their last order day 
       from the Sales.Orders table

    | CustomerID | OrderID | OrderDate |
    ------------------------------------

*/


SELECT CustomerID, OrderID, OrderDate
FROM Sales.Orders so
WHERE OrderDate in (
	select max(OrderDate) 
	from Sales.Orders so1
	where so1.CustomerID = so.CustomerID
)
order by CustomerID

