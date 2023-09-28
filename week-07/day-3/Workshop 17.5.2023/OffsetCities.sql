
/* 
    Find the table that contains data about cities.
    Write a query that returns the 10 cities with the highest population, but use the paging method.
    Alias the city population column as [population].


    | CityID | CityName | population |
    ----------------------------------

*/

select *
from sys.tables

select *
from Application.Cities

select cityID, CityName, LatestRecordedPopulation as [population]
from Application.Cities
ORDER BY LatestRecordedPopulation DESC
OFFSET 0 rows fetch next 10 rows only;
