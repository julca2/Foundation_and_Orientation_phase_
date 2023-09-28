/*
    Work with your new HR.Employees table.

    Whenever you do an INSERT, UPDATE or DELETE use the OUTPUT clause
    to return what was inserted, or what were the old values that changed.

    You can put the OUTPUT clause results into another table too for logging.

    Practice how to use the OUTPUT clause. 

*/
-------------insert--------------------------
DECLARE @insert_log TABLE
(EmployeeId int, FirstName nvarchar(20), Surname nvarchar(20), DateOfBirth date, Department nvarchar(50))

insert into hr.Employees (EmployeeID, FirstName, Surname, DateOfBirth, Department)
OUTPUT inserted.EmployeeID, inserted.FirstName, inserted.Surname, inserted.DateOfBirth, inserted.Department
INTO @insert_log
values (4, 'Imogen', 'Mckinney' , '1985-12-23','IT')

SELECT * FROM hr.Employees;
SELECT * FROM @insert_log;
--------------delete--------------------------
DECLARE @delete_log TABLE
(EmployeeId int, FirstName nvarchar(20), Surname nvarchar(20), DateOfBirth date, Department nvarchar(50))

DELETE FROM hr.Employees
OUTPUT deleted.EmployeeID, deleted.FirstName, deleted.Surname, deleted.DateOfBirth, deleted.Department
INTO @delete_log
WHERE EmployeeID = 4

SELECT * FROM hr.Employees;
SELECT * FROM @delete_log;
-------------update-------------------
DECLARE @update_log TABLE
(EmployeeId int, FirstName nvarchar(20), Surname nvarchar(20), DateOfBirth date, Department nvarchar(50))

update hr.Employees
set EmployeeId = 1
OUTPUT deleted.EmployeeID, deleted.FirstName, deleted.Surname, deleted.DateOfBirth, deleted.Department
INTO @update_log
where EmployeeId = 90



SELECT * FROM hr.Employees;
SELECT * FROM @update_log;