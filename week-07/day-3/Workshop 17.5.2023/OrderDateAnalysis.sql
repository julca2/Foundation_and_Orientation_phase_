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

-- on a specific date
select OrderID, OrderDate
from Sales.Orders
where OrderDate = '2015-05-15'

-- after a specific date
select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-05-15'

-- before a specific date
select OrderID, OrderDate
from Sales.Orders
where OrderDate < '2015-05-15'

 -- between specific dates
select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-05-15' and OrderDate < '2015-05-18' 

-- in one specific year

select OrderID, OrderDate
from Sales.Orders
where OrderDate like '2015%'

--in multiple specific years
select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-01-01' and OrderDate < '2018-01-01' 

--in a specific year and month
select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-05-01' and OrderDate < '2015-05-31' 

-- on the last day of a specific month
select OrderID, OrderDate
from Sales.Orders
where OrderDate = '2015-01-31' 

-- in different time intervals combined with AND/OR
select OrderID, OrderDate
from Sales.Orders
where OrderDate > '2015-05-15' and OrderDate < '2015-05-18' OR OrderDate > '2016-05-15' and OrderDate < '2016-05-18'






/*
    Look up T-SQL functions that handle dates like the OrderDate column 
    in Sales.Orders:
     - YEAR
     - MONTH
     - EOMONTH
     - DATENAME
     - DATEPART
     - DATEADD
     - DATEDIFF

    Write queries that return new values based on the OrderDate column values 
    by using these functions in the SELECT list. 
    You can alias the new column(s) as you like (eg: [mydate])

    You can also apply different row filters to your query.

    | OrderID | OrderDate | mydate
    ------------------------------

*/