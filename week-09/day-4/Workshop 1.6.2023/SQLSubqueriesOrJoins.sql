/*

    Rewrite the following subqueries as join queries.
	SELECT OrderID, OrderDate
FROM Sales.Orders
WHERE CustomerID IN
  (SELECT CustomerID
   FROM Sales.Customers
   WHERE PostalCityID = 33832);


SELECT CustomerID, CustomerName
FROM Sales.Customers c
WHERE CustomerName LIKE 'Anna%'
    AND EXISTS (SELECT * FROM Sales.Orders o
                WHERE c.CustomerID = o.CustomerID
                AND o.OrderDate >= '20140101' AND o.OrderDate < '20140201');


SELECT CustomerID, CustomerName
FROM Sales.Customers c
WHERE CustomerName LIKE 'Anna%'
    AND NOT EXISTS (SELECT * FROM Sales.Orders o
                    WHERE c.CustomerID = o.CustomerID
                    AND o.OrderDate >= '20140101' AND o.OrderDate < '20140201');
*/
---------------
	SELECT OrderID, OrderDate
FROM Sales.Orders
WHERE CustomerID IN
  (SELECT CustomerID
   FROM Sales.Customers
   WHERE PostalCityID = 33832);



SELECT OrderID, OrderDate
FROM Sales.Orders o
join Sales.Customers c on o.CustomerID = c.CustomerID
Where c.PostalCityID = 33831


-----------------------------------

SELECT distinct(c.CustomerID), CustomerName
FROM Sales.Customers c
join Sales.Orders o on c.CustomerID = o.CustomerID
WHERE CustomerName LIKE 'Anna%' and o.OrderDate >= '20140101' AND o.OrderDate < '20140201'

------------------------------------------------------------------------------------------------

SELECT CustomerID, CustomerName
FROM Sales.Customers c
WHERE CustomerName LIKE 'Anna%'
    AND NOT EXISTS (SELECT * FROM Sales.Orders o
                    WHERE c.CustomerID = o.CustomerID
                    AND o.OrderDate >= '20140101' AND o.OrderDate < '20140201');

SELECT distinct(c.CustomerID), c.CustomerName
FROM Sales.Customers c
left join Sales.Orders o on  o.CustomerID != c.CustomerID
WHERE c.CustomerName LIKE 'Anna%' and o.OrderDate >= '20140101' AND o.OrderDate < '20140201'


