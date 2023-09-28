/* 
    
    Write queries with a WHERE clause with different predicates/expressions 
    to query data from the Application.Countries table. 
    
    Try the operators in the operator precedence list 
    and combine them with AND / OR.
    
    Test how the operator precedence works.


    | CountryID | CountryName |
    ---------------------------

*/

select countryID, countryName
from Application.Countries
where CountryID like '%1%' and CountryName like '%ar%'

select countryID, countryName
from Application.Countries
where CountryID < 50 and CountryName like 'ar%' 

select countryID, countryName
from Application.Countries
where CountryID < 10 and CountryName like 'ar%' or CountryID >100 and CountryID < 150

select countryID, countryName
from Application.Countries
where CountryID < 10 and CountryName like 'ar%' or CountryID < 150

select countryID, countryName
from Application.Countries
where CountryID < 10 and (CountryName like 'ar%' or CountryID < 150)
