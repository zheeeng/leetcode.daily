/*
 * @lc app=leetcode id=119 lang=javascript
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (42.62%)
 * Total Accepted:    192.1K
 * Total Submissions: 450.6K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the k^th index row of the
 * Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 *
 * Example:
 *
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 *
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 */
/**
 * @param {number} rowIndex
 * @return {number[]}
 */
const calculate = (bot, up) => {
  if (up === 0) return 1
  let product = bot
  let quotient = 1
  let i
  for (i = 1; i < up; i++) {
    product *= (bot - i)
  }
  for (i = 2; i <= up; i++) {
    quotient *= i
  }
  return product / quotient
}

const getRow = (numRows) => {
  let res = []
  let i
  let mid = ~~(numRows / 2)
  for (i = 0; i <= mid; i++) {
    res.push(calculate(numRows, i))
  }
  return res.concat(res.slice(0, mid + (numRows % 2)).reverse())
}
