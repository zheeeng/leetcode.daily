/*
 * @lc app=leetcode id=38 lang=javascript
 *
 * [38] Count and Say
 *
 * https://leetcode.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (39.83%)
 * Total Accepted:    268.1K
 * Total Submissions: 672.1K
 * Testcase Example:  '1'
 *
 * The count-and-say sequence is the sequence of integers with the first five
 * terms as following:
 *
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the n^th term of the
 * count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a
 * string.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: 1
 * Output: "1"
 *
 *
 * Example 2:
 *
 *
 * Input: 4
 * Output: "1211"
 *
 */
const interpret = n => {
  let cache = []
  let res = ''
  for (c of n) {
    if (!cache.length || cache[cache.length - 1] === c) {
      cache.push(c)
    } else {
      res += cache.length + cache[0]
      cache = [c]
    }
  }
  return res + cache.length + cache[0]
}

/**
 * @param {number} n
 * @return {string}
 */
const countAndSay = (n) => Array.from({ length: n - 1 }).reduce(interpret, '1')

