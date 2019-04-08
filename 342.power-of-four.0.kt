/*
 * @lc app=leetcode id=342 lang=kotlin
 *
 * [342] Power of Four
 *
 * https://leetcode.com/problems/power-of-four/description/
 *
 * algorithms
 * Easy (40.05%)
 * Total Accepted:    109.2K
 * Total Submissions: 272.4K
 * Testcase Example:  '16'
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a
 * power of 4.
 *
 * Example 1:
 *
 *
 * Input: 16
 * Output: true
 *
 *
 *
 * Example 2:
 *
 *
 * Input: 5
 * Output: false
 *
 *
 * Follow up: Could you solve it without loops/recursion?
 */
class Solution_isPowerOfFour_0 {
    fun isPowerOfFour(num: Int): Boolean = when (num) {
        0, 2, 3 -> false
        1 -> true
        else -> num % 4 == 0 && isPowerOfFour(num / 4)
    }
}
