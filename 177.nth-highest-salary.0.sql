--
-- @lc app=leetcode id=177 lang=mysql
--
-- [177] Nth Highest Salary
--
-- https://leetcode.com/problems/nth-highest-salary/description/
--
-- database
-- Medium (25.41%)
-- Total Accepted:    61.4K
-- Total Submissions: 238.8K
-- Testcase Example:  '{"headers": {"Employee": ["Id", "Salary"]}, "argument": 2, "rows": {"Employee": [[1, 100], [2, 200], [3, 300]]}}'
--
-- Write a SQL query to get the n^th highest salary from the Employee table.
--
--
-- +----+--------+
-- | Id | Salary |
-- +----+--------+
-- | 1  | 100    |
-- | 2  | 200    |
-- | 3  | 300    |
-- +----+--------+
--
--
-- For example, given the above Employee table, the n^th highest salary where n
-- = 2 is 200. If there is no n^th highest salary, then the query should return
-- null.
--
--
-- +------------------------+
-- | getNthHighestSalary(2) |
-- +------------------------+
-- | 200                    |
-- +------------------------+
--
--
--
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        SELECT (SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC Limit 1 OFFSET N)
    );
END
