# Write your MySQL query statement below
select c.name as Customers from Customers c left join Orders o
on c.ID=o.customerID where customerId is null