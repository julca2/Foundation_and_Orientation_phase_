/*

    Modify the below query to return these columns 
    from the Application.Cities table:
     - cnt_all: count of all rows
     - cnt_pop: count of the LatestRecordedPopulation column values
     - max_pop: maximum value of LatestRecordedPopulation
     - min_pop: minimum value of LatestRecordedPopulation
     - sum_pop: sum aggregate of LatestRecordedPopulation
     - avg_pop: avg of LatestRecordedPopulation

   
    What does each column value show?

    | cnt_all | cnt_pop | max_pop | min_pop | sum_pop | avg_pop |
    -------------------------------------------------------------

*/

SELECT 
COUNT(CityID) as cnt_all, 
COUNT (LatestRecordedPopulation) as cnt_pop,
MAX(LatestRecordedPopulation) as max_pop,
MIN(LatestRecordedPopulation) as min_pop,
SUM (LatestRecordedPopulation)as sum_pop,
AVG(LatestRecordedPopulation) as avg_pop
FROM Application.Cities;

/*

    Apply a WHERE filter to either:
     - calculate with only known LatestRecordedPopulation values
     - OR calculate with only unknown LatestRecordedPopulation values

    How does the result change?

    | cnt_all | cnt_pop | max_pop | min_pop | sum_pop | avg_pop |
    -------------------------------------------------------------
*/
SELECT 
COUNT(CityID) as cnt_all, 
COUNT (LatestRecordedPopulation) as cnt_pop,
MAX(LatestRecordedPopulation) as max_pop,
MIN(LatestRecordedPopulation) as min_pop,
SUM (LatestRecordedPopulation)as sum_pop,
AVG(LatestRecordedPopulation) as avg_pop
FROM Application.Cities
WHERE LatestRecordedPopulation IS NOT NULL


SELECT 
COUNT(CityID) as cnt_all, 
COUNT (LatestRecordedPopulation) as cnt_pop,
MAX(LatestRecordedPopulation) as max_pop,
MIN(LatestRecordedPopulation) as min_pop,
SUM (LatestRecordedPopulation)as sum_pop,
AVG(LatestRecordedPopulation) as avg_pop
FROM Application.Cities
WHERE LatestRecordedPopulation IS NULL


/*
  
    Modify this new WHERE filter query and make sure that:
     - the cnt_pop column always show the very same value as cnt_all 
       no matter what the filter is

    | cnt_all | cnt_pop | max_pop | min_pop | sum_pop | avg_pop |
    -------------------------------------------------------------

*/

SELECT 
COUNT(CityID) as cnt_all, 
COUNT (LatestRecordedPopulation) as cnt_pop,
MAX(LatestRecordedPopulation) as max_pop,
MIN(LatestRecordedPopulation) as min_pop,
SUM (LatestRecordedPopulation)as sum_pop,
AVG(LatestRecordedPopulation) as avg_pop
FROM Application.Cities
WHERE LatestRecordedPopulation IS NOT NULL



/*

    Modify the original (not filtered) query by adding a new column:
     - cnt_unknown_pop: count of only the unknown LatestRecordedPopulation 
       values

 | cnt_all | cnt_pop | cnt_unknown_pop | max_pop | min_pop | sum_pop | avg_pop |
 -------------------------------------------------------------------------------

*/

SELECT 
COUNT(CityID) as cnt_all, 
COUNT (LatestRecordedPopulation) as cnt_pop,
COUNT(CityID) - COUNT (LatestRecordedPopulation) as cnt_unknown_pop,
MAX(LatestRecordedPopulation) as max_pop,
MIN(LatestRecordedPopulation) as min_pop,
SUM (LatestRecordedPopulation)as sum_pop,
AVG(LatestRecordedPopulation) as avg_pop
FROM Application.Cities
