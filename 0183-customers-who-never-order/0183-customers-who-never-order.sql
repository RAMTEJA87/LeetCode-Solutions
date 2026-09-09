# Write your MySQL query statement below
select name as Customers from Customers where id NOt in (select customerId from orders);