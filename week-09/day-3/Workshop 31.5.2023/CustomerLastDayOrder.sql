/* 

    Modify the below query:
     - to return the orders that each customer placed on their last order day 
       from the Sales.Orders table

    | CustomerID | OrderID | OrderDate |
    ------------------------------------
	SELECT CustomerID, OrderID, OrderDate 
	FROM Sales.Orders;
*/

SELECT CustomerID, OrderID, OrderDate 
FROM Sales.Orders
WHERE OrderDate in (
	select max(OrderDate)
	from Sales.Orders
	group by CustomerID
)
