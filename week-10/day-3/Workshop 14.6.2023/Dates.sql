/* 

    Write queries for the Sales.Orders table that return orders that were placed
     - on a specific date
     - after a specific date
     - before a specific date
     - between specific dates
     - in one specific year
     - in multiple specific years
     - in a specific year and month
     - on the last day of a specific month
     - in different time intervals combined with AND/OR

    Watch out for the WHERE clause, try to avoid using functions 
    on the left hand side of your logical expressions!

    | OrderID | OrderDate |
    -----------------------

*/
select OrderID, OrderDate
from Sales.Orders
where OrderDate = '2015-04-13'

select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-04-13'

select OrderID, OrderDate
from Sales.Orders
where OrderDate < '2015-04-13'

--musi byt nizsi datum prvy
select OrderID, OrderDate
from Sales.Orders
where OrderDate between '2015-01-01' and '2015-04-14'


select OrderID, OrderDate
from Sales.Orders
where OrderDate between '2015-01-01' and '2015-12-31'

select OrderID, OrderDate
from Sales.Orders
where year(OrderDate) = 2013

select OrderID, OrderDate
from Sales.Orders
where year(OrderDate) = 2013 or year(OrderDate) = 2014

select OrderID, OrderDate
from Sales.Orders
where year(OrderDate) = 2013 and month(OrderDate) = 10



