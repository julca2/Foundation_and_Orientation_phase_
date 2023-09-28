
/* 

    City populations in the Application.Cities table are sometimes UNKNOWN.
    
    Write a query that returns the city names where the populations are known.
    Write a query that returns the city names where the populations are UNKNOWN.
    Alias the LatestRecordedPopulation column as [population].

    | CityName | population |
    -------------------------

    Which operators do you need to use?

*/
-- i need to use is/ is not

select CityName, LatestRecordedPopulation as [population]
from Application.Cities
where LatestRecordedPopulation is not null


select CityName, LatestRecordedPopulation as [population]
from Application.Cities
where LatestRecordedPopulation is null


