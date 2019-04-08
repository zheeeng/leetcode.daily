/*
 * @lc app=leetcode id=231 lang=kotlin
 *
 * [231] Power of Two
 *
 * https://leetcode.com/problems/power-of-two/description/
 *
 * algorithms
 * Easy (41.75%)
 * Total Accepted:    219.5K
 * Total Submissions: 525.6K
 * Testcase Example:  '1'
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 *
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 *
 *
 * Example 2:
 *
 *
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 *
 * Example 3:
 *
 *
 * Input: 218
 * Output: false
 *
 */
class Solution_isPowerOfTwo_0 {
    fun isPowerOfTwo(n: Int): Boolean = when (n) {
        0 -> false
        1 -> true
        else -> (n % 2) == 0 && isPowerOfTwo(n / 2)
    }
}
