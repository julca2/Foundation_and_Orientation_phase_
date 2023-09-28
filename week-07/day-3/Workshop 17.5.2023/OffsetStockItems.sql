/* 

    Write a query for the Sales.OrderLines table that returns:
    - unique stock items and their descriptions
    - ordered by stock item ID in ascending order
    - skip the first 29 rows then return only the next 50 rows


    | StockItemID | Description |
    -----------------------------

*/

select distinct StockItemID, Description
from Sales.OrderLines
order by StockItemID asc
offset 29 rows fetch next 50 rows only