/* 
  
    Write a query that determines the next CityID 
    in the Application.Cities table.
  
    | CityID |  CityName  | nextcityid |
    ------------------------------------
    |   1    | Aaronsburg |      3     |
    |   3    | Abanda     |      4     |
    |   4    | Abbeville  |      5     |
    |   5    | Abbeville  |      6     |
    |  ...   |    ...     |     ...    |
    | 38186  | Zwolle     |     NULL   |

*/
select CityID, CityName, Lead(CityID) over (Order by CityID) nextcityid 
from Application.Cities






