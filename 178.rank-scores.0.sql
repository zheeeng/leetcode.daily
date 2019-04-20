--
-- @lc app=leetcode id=178 lang=mysql
--
-- [178] Rank Scores
--
-- https://leetcode.com/problems/rank-scores/description/
--
-- database
-- Medium (35.45%)
-- Total Accepted:    59.9K
-- Total Submissions: 167.2K
-- Testcase Example:  '{"headers": {"Scores": ["Id", "Score"]}, "rows": {"Scores": [[1, 3.50], [2, 3.65], [3, 4.00], [4, 3.85], [5, 4.00], [6, 3.65]]}}'
--
-- Write a SQL query to rank scores. If there is a tie between two scores, both
-- should have the same ranking. Note that after a tie, the next ranking number
-- should be the next consecutive integer value. In other words, there should
-- be no "holes" between ranks.
--
--
-- +----+-------+
-- | Id | Score |
-- +----+-------+
-- | 1  | 3.50  |
-- | 2  | 3.65  |
-- | 3  | 4.00  |
-- | 4  | 3.85  |
-- | 5  | 4.00  |
-- | 6  | 3.65  |
-- +----+-------+
--
--
-- For example, given the above Scores table, your query should generate the
-- following report (order by highest score):
--
--
-- +-------+------+
-- | Score | Rank |
-- +-------+------+
-- | 4.00  | 1    |
-- | 4.00  | 1    |
-- | 3.85  | 2    |
-- | 3.65  | 3    |
-- | 3.65  | 3    |
-- | 3.50  | 4    |
-- +-------+------+
--
--
--
SELECT
    Score,
    (
        SELECT
            count(DISTINCT Score)
        FROM
            Scores Sb
        WHERE
            Sb.Score >= Sa.Score
    ) AS Rank
FROM
    Scores Sa
    ORDER BY Score DESC
