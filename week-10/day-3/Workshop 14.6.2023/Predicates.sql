/* 
    
    Write queries with a WHERE clause with different predicates/expressions 
    to query data from the Application.Countries table. 
    
    Try the operators in the operator precedence list 
    and combine them with AND / OR.
    
    Test how the operator precedence works.


    | CountryID | CountryName |
    ---------------------------

*/

--% viac znakov
select CountryID, CountryName
from Application.Countries
where CountryID > 50 and CountryName like '%ab%'

--_ jeden znak
select CountryID, CountryName
from Application.Countries
where CountryID < 999 and CountryName like '_ab%'


select CountryID, CountryName
from Application.Countries
where CountryID > 50 or CountryName like '%u%'
