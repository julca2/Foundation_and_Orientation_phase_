/*

    You haven't learned about creating tables yet, so you'll work with 'virtual'
    tables.
    This is a special use case of VALUES which you'll also use when inserting 
    data into tables.

    There are two sets: 
     - m with a column named mynumber, and with column values from 0 to 9
     - n with a column named mynumber, and with column values from 0 to 9
    These act as two tables that you can join and select from.

    Modify the below query so that you get m * n unique numbers (10 * 10 = 100),
    ordered from 1 to 100.

*/
SELECT concat(str(m.mynumber),str(n.mynumber)) as numbers
FROM 
(VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) m(mynumber)
cross join
 (VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) n(mynumber)

 SELECT str(m.mynumber) + str(n.mynumber) as numbers
FROM 
(VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) m(mynumber)
cross join
 (VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) n(mynumber)


SELECT (ROW_NUMBER() OVER (order by(m.mynumber * 10))-1 )AS unique_number, *
FROM (VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) m(mynumber)
cross JOIN (VALUES((0)),((1)),((2)),((3)),((4)),((5)),((6)),((7)),((8)),((9))) n(mynumber)