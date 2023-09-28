/*

    Modify the below query to do a CROSS JOIN.

    Moreover, this is a special type of join too, a self-join.
    The query joins the Application.Countries table to itself.


    | left_id | left_name | right_id | right_name |
    -----------------------------------------------

    How many rows do you get? Why?
	-- 36 100
*/
SELECT t1.CountryID as left_id, t1.CountryName as left_name, 
       t2.CountryID as right_id, t2.CountryName as right_name
FROM Application.Countries t2
 Cross JOIN Application.Countries t1

