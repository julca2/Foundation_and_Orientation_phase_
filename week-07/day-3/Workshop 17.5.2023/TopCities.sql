/*
    Find the table that contains data about cities.
    Write a query that returns the 10 cities with the highest population.
    Alias the city population column as [population].

    | CityID | CityName | population |
    ----------------------------------

*/

select *
from sys.tables

select *
from Application.Cities

select TOP 10 cityID, CityName, LatestRecordedPopulation as [population]
from Application.Cities
ORDER BY LatestRecordedPopulation DESC



