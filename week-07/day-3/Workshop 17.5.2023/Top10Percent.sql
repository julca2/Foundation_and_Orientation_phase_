/*
    Remove the TOP 10 filter and see how many rows are returned.
    Apply a TOP ten percent filter instead and see how many rows are returned.
    Try different filter and percent values.
*/
SELECT TOP 10 OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 10
GROUP BY OrderID
ORDER BY [Order ID] ASC;

SELECT TOP(10) PERCENT OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 10
GROUP BY OrderID
ORDER BY [Order ID] ASC;

SELECT TOP(30) PERCENT OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 10
GROUP BY OrderID
ORDER BY [Order ID] ASC;

SELECT OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 50
GROUP BY OrderID
ORDER BY [Order ID] ASC;

SELECT TOP(30) PERCENT OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 50
GROUP BY OrderID
ORDER BY [Order ID] ASC;



