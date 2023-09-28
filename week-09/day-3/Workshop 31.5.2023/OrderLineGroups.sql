/* 

    Write a query for the Sales.OrderLines table that:
     - returns StockItemID groups
     - calculate the sum aggregate of quantities for each group
     - order the results by StockItemID in ascending order
  
    | StockItemID | sum_qty |
    -------------------------


*/

select StockItemID, SUM(Quantity) as sum_qty
from Sales.OrderLines
group by StockItemID
order by StockItemID asc
/* 

    Modify the query:
     - group only those order lines where the quantity >= 10
     - count only those order lines where the quantity >= 10

    | StockItemID | sum_qty | cnt_qty |
    -----------------------------------


*/

select StockItemID, SUM(Quantity) as sum_qty, COUNT(Quantity) as cnt_qty
from Sales.OrderLines
where Quantity >=10
group by StockItemID
order by StockItemID asc

/* 

    Modify the latest query:
     - to return only those groups where the sum_qty aggregate > 10000

    | StockItemID | sum_qty | cnt_qty |
    -----------------------------------


*/
select StockItemID, SUM(Quantity) as sum_qty, COUNT(Quantity) as cnt_qty
from Sales.OrderLines

group by StockItemID
having SUM(Quantity) > 10000
order by StockItemID asc
