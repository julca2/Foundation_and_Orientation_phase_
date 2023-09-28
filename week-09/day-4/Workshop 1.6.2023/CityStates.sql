/*

    Modify the below query to return cities from the states of Arizona, 
    Washington and Utah and also display the name of their states.

    Order the results by State Name in ascending order.


    | CityID | CityName | State Name |
    ----------------------------------

    Hint: the Application.Cities and the Application.StateProvinces tables 
          both have a StateProvinceID column that you should use.

*/
SELECT CityID, CityName, StateProvinceName as 'State Name'
FROM Application.Cities as c
join Application.StateProvinces as st on c.StateProvinceID = st.StateProvinceID
order by 'State Name' asc

