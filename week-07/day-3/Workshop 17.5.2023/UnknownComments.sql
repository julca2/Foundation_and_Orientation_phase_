/* 

    Write a query that returns the first 100 order ids with comments 
    from the Sales.Orders table.
    
    If a comment is UNKNOWN, display the string 'not available' instead.

    Try different methods to solve this problem.

    | OrderID | Comments |
    ----------------------

*/

select TOP 100 orderID,
case when Comments is null then 'not available' else Comments end as Comments
from Sales.Orders

select TOP 100 orderID, 
coalesce(Comments, 'not available') as Comments
from Sales.Orders

--case when Comments is null then 'not available' else Comments end

