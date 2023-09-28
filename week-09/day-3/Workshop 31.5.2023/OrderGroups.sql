/* 

    Write a query for the Sales.Orders table that:
     - returns OrderDate year groups
     - calculate the number of OrderIDs for each group
     - order the results by OrderDate year in descending order
  
    | orderyear | cnt_order |
    -------------------------

*/
select YEAR(OrderDate) as orderyear, count(OrderID) as cnt_order
from Sales.Orders
group by YEAR(OrderDate)
order by YEAR(OrderDate) DESC


/* 

    Modify the query:
     - group on OrderDate year AND OrderDate month
     - calculate the number of OrderIDs for each group
     - order the results by OrderDate year in descending order
       and Orderdate month in ascending order

    | orderyear | ordermonth | cnt_order |
    --------------------------------------

*/
select YEAR(OrderDate) as orderyear,MONTH(OrderDate) as ordermonth, count(OrderID) as cnt_order
from Sales.Orders
group by YEAR(OrderDate),MONTH(OrderDate)
order by YEAR(OrderDate) DESC, MONTH(OrderDate) ASC


/* 

    Modify the query:
     - to return only those groups that have more than 2000 OrderIDs

    | orderyear | ordermonth | cnt_order |
    --------------------------------------

*/
select YEAR(OrderDate) as orderyear,MONTH(OrderDate) as ordermonth, count(OrderID) as cnt_order
from Sales.Orders
group by YEAR(OrderDate),MONTH(OrderDate)
having count(OrderID) > 2000
order by YEAR(OrderDate) DESC, MONTH(OrderDate) ASC
