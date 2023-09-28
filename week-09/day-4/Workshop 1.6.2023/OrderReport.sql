/*

    Write a query that returns a report for specific Orders.

    Each order has detailed orderlines that show what items were ordered and 
    in which quantity.

    Use the Sales.Orders and Sales.OrderLines tables. Sales.OrderLines has an 
    OrderID column that you should use.

    Return only those orders that were placed between '2013-05-01' and 
    '2013-06-30' and belong to CustomerID = 50.
    Order the results by OrderDate in descending order.


    | OrderID | OrderLineID | CustomerID | OrderDate | StockItemID |
    | Description | Quantity |
    ----------------------------------------------------------------

*/

select ol.OrderID, ol.OrderLineID, s.CustomerID, s.OrderDate, ol.StockItemID, ol.Description, ol.Quantity 
from Sales.OrderLines ol
join Sales.Orders s on s.OrderID = ol.OrderID
where CustomerID = 50 AND (s.OrderDate between '2013-05-01' and '2013-06-30')
order by s.OrderDate desc