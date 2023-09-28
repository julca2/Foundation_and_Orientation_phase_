/*
    !!! Make sure you save all your scripts so that you can reuse them later !!!

    Once you have your Employees table created,
    insert a few data rows into this table with the INSERT INTO statement.

    Make sure you insert data according to the data types you specified.

    Find an example to insert a data row with two column values below.

*/

insert into HR.Employees (EmployeeID, FirstName, Surname, DateOfBirth, Department)
values (1, 'John', 'Doe' , '1990-02-03','IT')

insert into HR.Employees (EmployeeID, FirstName, Surname, DateOfBirth, Department, Nickname)
values (2, 'Lili', 'Howell' , '1992-04-13','HR', 'Lili')

insert into HR.Employees (EmployeeID, FirstName, Surname, DateOfBirth, Department)
values (3, 'Fynn', 'Briggs' , '1998-01-27','Marketing')

select *
from hr.employees
