
/* 
    Modify this query so that the GROUP BY and the HAVING clauses also use the [Order ID] column alias.
    What happens? Why?
*/
SELECT OrderID AS [Order ID], SUM(Quantity) AS [Order ID]
--order id je v zatvorke lebo ma vnutri medzeru
FROM Sales.OrderLines
WHERE UnitPrice > 10
GROUP BY OrderID
HAVING OrderID IN (46, 47, 48)
ORDER BY [Order ID] ASC

--using OrderID alias leads to an error
--Ambiguous column name 'Order ID'.
-- order by - dont know which one to use

-- two columns in table (not in db) cannot have the same name
