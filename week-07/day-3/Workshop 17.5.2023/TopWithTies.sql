/*
    Run the following query and see the results. What do you see?
    Modify the query to use the TOP filter WITH TIES. What happens?
    Modify the query to remove duplicates and then return the TOP 10 UnitPrice. What happens?
*/

SELECT TOP 10 UnitPrice
FROM Sales.OrderLines
ORDER BY UnitPrice DESC;
-- first ten rows with highest prices, all prices are same

SELECT TOP 10 WITH TIES UnitPrice
FROM Sales.OrderLines
ORDER BY UnitPrice DESC;
-- with ties it returns all rows where are the price from top ten 

SELECT DISTINCT TOP 10 UnitPrice
FROM Sales.OrderLines
ORDER BY UnitPrice DESC;
-- distinct deletes duplicates, we can see that each row have different price
