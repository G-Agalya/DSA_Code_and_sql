-- Write your PostgreSQL query statement below
select * from Users where Users.mail ~ '^[A-Za-z][A-Za-z0-9._-]*@leetcode\.com$'