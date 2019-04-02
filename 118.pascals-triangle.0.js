/*
 * @lc app=leetcode id=118 lang=javascript
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (45.08%)
 * Total Accepted:    237.4K
 * Total Submissions: 526.6K
 * Testcase Example:  '5'
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 *
 * Example:
 *
 *
 * Input: 5
 * Output:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 *
 *
 */
/**
 * @param {number} numRows
 * @return {number[][]}
 */
const generate = (numRows) => {
  if (numRows === 0) return []
  let res = [ [1] ]
  for (let i = 1; i < numRows; i++) {
    let row = []
    for (let j = 0; j < i + 1; j++) {
      row.push((res[i - 1][j - 1] || 0) + (res[i - 1][j] || 0))
    }
    res.push(row)
  }
  return res
}
