--
-- @lc app=leetcode id=596 lang=mysql
--
-- [596] Classes More Than 5 Students
--
SELECT class FROM courses
    GROUP BY class HAVING COUNT(distinct student) >= 5
