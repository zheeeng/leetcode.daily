/*
 * @lc app=leetcode id=9 lang=javascript
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (42.54%)
 * Total Accepted:    542K
 * Total Submissions: 1.3M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */
/**
 * @param {number} x
 * @return {boolean}
 */
const MAX_VALUE = Math.pow(2, 31) - 1
const MIN_VALUE = -Math.pow(2, 31)

const isPalindrome = function(x) {
  if (x < 0) return false

  let val = x
  let rev = 0
  // unsafe to other language
  while (rev < MAX_VALUE && rev > MIN_VALUE) {
    if (val < 1 && val > -1) return rev === x
    rev = rev * 10 + val % 10
    val = ~~(val / 10)
  }

  return false
}
