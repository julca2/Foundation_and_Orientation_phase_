/*

    Use the Warehouse.StockItems table.

    Write queries that return stockitems with the following characteristics:
    - name starts with 'DBA'
    - name ends with 't'
    - name does not end with 'k'
    - name contains the word 'joke'
    - name starts with the letters 'a' or 'b' or 'c' or 'f'
    - name that does not contain the words 'flash drive'
    - name that contains the word 'ham' and the following character is not 'm'
    - name starts with 'a', next character can be anything between 'l' and 't' 
      and ends with any character between 'l' and 'p'
    - name is exactly 'DBA joke mug - it depends (Black)'

    | StockItemID | StockItemName |
    -------------------------------

*/

-- name starts with 'DBA'
select *
from Warehouse.StockItems
where StockItemName like 'DBA%'

--- name ends with 't'
select *
from Warehouse.StockItems
where StockItemName like '%t'

--name does not end with 'k'
select *
from Warehouse.StockItems
where StockItemName not like '%k'

--name contains the word 'joke'
select *
from Warehouse.StockItems
where StockItemName like '%joke%'

--name starts with the letters 'a' or 'b' or 'c' or 'f'
select *
from Warehouse.StockItems
where LEFT(StockItemName, 1) IN ('a', 'b', 'c', 'f')

-- name that does not contain the words 'flash drive'
select *
from Warehouse.StockItems
where StockItemName not like '%flash drive%'

-- name that contains the word 'ham' and the following character is not 'm'
select *
from Warehouse.StockItems
where StockItemName like '%ham%' and StockItemName not like '%hamm%'

-- name starts with 'a', next character can be anything between 'l' and 't' 
--and ends with any character between 'l' and 'p'
select *
from Warehouse.StockItems
where StockItemName like 'a[l-t]%[l-p]'

--name is exactly 'DBA joke mug - it depends (Black)'
select *
from Warehouse.StockItems
where StockItemName like 'DBA joke mug - it depends (Black)'
