--
-- @lc app=leetcode id=627 lang=mysql
--
-- [627] Swap Salary
--
# Write your MySQL query statement below
UPDATE salary
SET sex = CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END
