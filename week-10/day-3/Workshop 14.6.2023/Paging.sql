/* 
    Find the table that contains data about cities.
    Write a query that returns the 10 cities with the highest population, but use the paging method.
    Alias the city population column as [population].


    | CityID | CityName | population |
    ----------------------------------

*/

select *
from INFORMATION_SCHEMA.COLUMNS
WHERE COLUMN_NAME = 'CityID'
--aj ked chcem prve, nepusti ma to bez offset
select CityID, CityName, LatestRecordedPopulation as [population]
from Application.Cities
order by LatestRecordedPopulation desc
offset 0 rows fetch next 10 rows only;

/* 

    Write a query for the Sales.OrderLines table that returns:
    - unique stock items and their descriptions
    - ordered by stock item ID in ascending order
    - skip the first 29 rows then return only the next 50 rows


    | StockItemID | Description |
    -----------------------------

*/

select Distinct StockItemID, Description
from Sales.OrderLines
order by StockItemID asc
offset 29 rows fetch next 50 rows only