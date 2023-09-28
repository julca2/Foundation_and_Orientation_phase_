/* 

    Modify the below query:
     - to return only those customers whose name starts with 'Anna'
     - AND did not place any orders in January 2014

    | CustomerID | CustomerName |
    -----------------------------
	SELECT CustomerID, CustomerName
	FROM Sales.Customers;

*/
--SELECT *
--FROM Sales.Customers

--Select*
--From Sales.Orders

SELECT CustomerID, CustomerName
FROM Sales.Customers c
WHERE CustomerName LIKE 'Anna%' AND EXISTS
(
SELECT * 
FROM Sales.Orders o         
WHERE o.CustomerID = c.CustomerID AND OrderDate LIKE '2014-01%'
)



