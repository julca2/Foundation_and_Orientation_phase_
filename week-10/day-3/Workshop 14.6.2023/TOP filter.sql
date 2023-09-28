/*
    Remove the TOP 10 filter and see how many rows are returned.
    Apply a TOP ten percent filter instead and see how many rows are returned.
    Try different filter and percent values.
*/
SELECT TOP 10 percent OrderID AS [Order ID], SUM(Quantity) AS Sum_Qty
FROM Sales.OrderLines
WHERE UnitPrice > 10
GROUP BY OrderID
ORDER BY [Order ID] ASC;

/*
    Run the following query and see the results. What do you see?
    Modify the query to use the TOP filter WITH TIES. What happens?
    Modify the query to remove duplicates and then return the TOP 10 UnitPrice. What happens?
*/
SELECT DISTINCT TOP 10  UnitPrice
FROM Sales.OrderLines
ORDER BY UnitPrice DESC;

/*
    Find the table that contains data about cities.
    Write a query that returns the 10 cities with the highest population.
    Alias the city population column as [population].

    | CityID | CityName | population |
    ----------------------------------

*/
select *
from INFORMATION_SCHEMA.COLUMNS
WHERE COLUMN_NAME = 'CityID'

select TOP 10 CityID, CityName, LatestRecordedPopulation as [population]
from Application.Cities
order by LatestRecordedPopulation desc


