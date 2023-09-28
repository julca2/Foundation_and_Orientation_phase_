/* 

    City populations in the Application.Cities table are sometimes UNKNOWN.
    
    Write a query that returns the city names where the populations are known.
    Write a query that returns the city names where the populations are UNKNOWN.
    Alias the LatestRecordedPopulation column as [population].

    | CityName | population |
    -------------------------

    Which operators do you need to use?

*/
--check how many columns is there
select CityName, LatestRecordedPopulation as population
from Application.Cities

--not nulls
select CityName, LatestRecordedPopulation as population
from Application.Cities
where LatestRecordedPopulation is not null

--nulls
select CityName, LatestRecordedPopulation as population
from Application.Cities
where LatestRecordedPopulation is null

/* 

    Write a query that returns the first 100 order ids with comments 
    from the Sales.Orders table.
    
    If a comment is UNKNOWN, display the string 'not available' instead.

    Try different methods to solve this problem.

    | OrderID | Comments |
    ----------------------

*/
select TOP 100 OrderID, Coalesce(Comments, 'not available') as Comments
from Sales.Orders

select OrderID, Coalesce(Comments, 'not available') as Comments
from Sales.Orders
order by OrderID
offset 0 rows fetch next 100 rows only;


