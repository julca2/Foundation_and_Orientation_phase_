/* 

    Write a query for the Sales.Orders table that:
     - counts the order dates 
     - counts the unique order dates

    | cnt_orderdate | cnt_unique_orderdate |
    ----------------------------------------
	

*/

select COUNT(OrderDate) as cnt_orderdate, count (Distinct OrderDate) as cnt_unique_orderdate
from Sales.Orders