/* 
    Find the table where there are order dates.
    Write a query that returns the distinct order dates in descending order.
    Alias the returned column as [Order Date].  

    | Order Date |
    --------------

    Try using a different ordering, not on order date. What happens?

*/

select *
from sys.tables
where name like 'Orders'

select distinct OrderDate as [Order Date]
from Sales.Orders
order by OrderDate desc


