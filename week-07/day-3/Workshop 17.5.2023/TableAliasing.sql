/* 
    Modify this query so that you alias the Sales.OrderLines table.

    Then qualify the column names in the SELECT list with the table alias.
*/


SELECT T2.OrderID AS [Order ID], SUM(T2.Quantity) AS Sum_Qty
FROM Sales.OrderLines as T2
WHERE UnitPrice > 10
GROUP BY OrderID
HAVING OrderID IN (46, 47, 48)
ORDER BY [Order ID] ASC;