/* 

    Modify the below query:
     - to return only the last day orders in general from the Sales.Orders table

    | CustomerID | OrderID | OrderDate |
    ------------------------------------

	SELECT CustomerID, OrderID, OrderDate 
	FROM Sales.Orders;

*/

SELECT TOP 1 CustomerID, OrderID, OrderDate 
FROM Sales.Orders
WHERE OrderDate = (
select max(OrderDate)
from Sales.Orders
)