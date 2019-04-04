/*
 * @lc app=leetcode id=7 lang=javascript
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.23%)
 * Total Accepted:    647.1K
 * Total Submissions: 2.6M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
/**
 * @param {number} x
 * @return {number}
 */
const MAX_VALUE = Math.pow(2, 31) - 1
const MIN_VALUE = -Math.pow(2, 31)

const reverse = (x) => {
  let res = 0
  // unsafe to other language
  while (res < MAX_VALUE && res > MIN_VALUE) {
    if (x < 1 && x > -1) return res
    res = res * 10 + x % 10
    x = ~~(x / 10)
  }

  return 0
}
