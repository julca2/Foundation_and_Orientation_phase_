/*

    Write a query that returns a report for specific Customers.

    Each order has detailed orderlines that show what items were ordered and 
    in which quantity.

    This time you'll need to work with more than two tables!
    This is called a multi-join query.

    Use the Sales.Customers, Sales.Orders and Sales.OrderLines tables. 
    Sales.OrderLines has an OrderID column that you should use.
    Sales.Orders has a CustomerID column that you should use.

    Return those 5 customers who ordered the most quantities in 2015.


    | CustomerID | CustomerName | sum_qty |
    ---------------------------------------

*/
select top 5 c.CustomerID, c.CustomerName, sum(ol.Quantity) as sum_qty
from Sales.OrderLines ol
join Sales.Orders o on o.OrderID = ol.OrderID
join Sales.Customers c on o.CustomerID = c.CustomerID
where o.OrderDate between '2015-01-01' and '2015-12-31'
group by c.CustomerID, c.CustomerName
order by sum_qty desc







select *
--from Sales.OrderLines
--from Sales.Customers
from Sales.Orders