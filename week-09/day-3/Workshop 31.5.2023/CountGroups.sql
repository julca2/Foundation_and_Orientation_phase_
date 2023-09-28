/* 

    Write a query on the Sales.OrderLines table that:
     - create groups of stock item IDs and their sum aggregate quantities
     - return only those groups that contain more than 1100 rows

    | StockItemID | sum_qty |
    -------------------------


*/
select StockItemID, sum(Quantity) as sum_qty
from Sales.OrderLines
group by StockItemID
having COUNT(Quantity)>1100
