/* 

    Modify the below query:
     - to return only those customers whose name starts with 'Anna'
     - AND did not place any orders in January 2014

    | CustomerID | CustomerName |
    -----------------------------

*/
SELECT CustomerID, CustomerName
FROM Sales.Customers c
WHERE CustomerName like 'Anna%'
AND NOT EXISTS(
	select OrderDate
	FROM Sales.Orders o
	Where c.CustomerID = o.CustomerID AND (YEAR(o.OrderDate) = 2014 and MONTH(o.OrderDate) = 1)
	)


