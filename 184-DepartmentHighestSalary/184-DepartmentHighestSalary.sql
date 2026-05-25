-- Last updated: 5/25/2026, 11:19:23 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary from employee e
INNER JOIN Department d ON e.departmentId = d.id
WHERE (e.departmentId, e.salary) IN (SELECT departmentId, MAX(salary) FROM Employee GROUP BY departmentId)