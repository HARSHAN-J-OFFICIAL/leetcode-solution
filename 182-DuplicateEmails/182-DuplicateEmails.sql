-- Last updated: 5/25/2026, 11:19:24 AM
# Write your MySQL query statement below
SELECT email FROM person GROUP BY email HAVING count(email)>1;