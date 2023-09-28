/*

    Write a query that returns a report for specific Orders.

    Each order has detailed orderlines that show what items were ordered and 
    in which quantity.

    Use the Sales.Orders and Sales.OrderLines tables. Sales.OrderLines has 
    an OrderID column that you should use.

    Return the 5 highest aggregated order quantity for those orders 
    that were placed between '2013-09-01' and '2013-12-31' and 
    belong to CustomerID = 100.


    | OrderID | sum_qty |
    ---------------------

*/

select TOP 5 ol.OrderID, sum(Quantity) as sum_qty
from Sales.OrderLines ol
join Sales.Orders o on ol.OrderID=o.OrderID
where o.CustomerID = 100 AND (o.OrderDate between '2013-09-01' and '2013-12-31')
group by ol.OrderID
order by sum_qty desc