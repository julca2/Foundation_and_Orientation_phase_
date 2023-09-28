/* 
    
    CASE expressions can be used in other clauses too, other than SELECT.

    Write a query that uses conditional ordering.
    Order the people by their full name in the Application.People table
     - in ascending order if they are an employee
     - in descending order if they are a vendor (not an employee)

    | FullName | IsEmployee |
    -------------------------

*/

select FullName, IsEmployee
from Application.People
where IsEmployee = 1 
order by FullName asc

select FullName, IsEmployee
from Application.People
where IsEmployee = 0 
order by FullName desc