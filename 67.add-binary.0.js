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
  let r = ''
  let c = '0'

  for (let l = Math.max(a.length, b.length), i = 1; l > 0; l -= 10, i++) {
    sum = (parseInt(a.slice(-10), 2) + parseInt(b.slice(-10), 2) + parseInt(c, 2)).toString(2)
    c = sum.slice(0, -10) || '0'
    sum = ('0000000000' +  sum).slice(-10)
    a = a.slice(0, -10) || '0'
    b = b.slice(0, -10) || '0'
    r = sum + r
  }
  r = c + r
  return r.slice(r.indexOf('1'))
}
