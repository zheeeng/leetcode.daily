/*
 * @lc app=leetcode id=67 lang=javascript
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (38.30%)
 * Total Accepted:    286.5K
 * Total Submissions: 746.3K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 */
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
const addBinary = (a, b) => {
  a = a.split('').reverse().map(c => +c)
  b = b.split('').reverse().map(c => +c)
  const toReduce = a.length > b.length ? a : b
  const toCons = a.length > b.length ? b : a
  let bitSum
  return toReduce.reduce((res, c, i) => {
    bitSum = res[res.length - 1 - i] + c + (toCons[i] || 0)
    res[res.length - 1 - i] = bitSum % 2
    res.unshift(bitSum > 1 ? 1 : 0)
    return res
  }, [0]).join('').replace(/^0?([01]*)$/, '$1')
}
