/*
 * @lc app=leetcode id=326 lang=kotlin
 *
 * [326] Power of Three
 *
 * https://leetcode.com/problems/power-of-three/description/
 *
 * algorithms
 * Easy (41.49%)
 * Total Accepted:    176.1K
 * Total Submissions: 424.3K
 * Testcase Example:  '27'
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 *
 * Input: 27
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: 0
 * Output: false
 *
 * Example 3:
 *
 *
 * Input: 9
 * Output: true
 *
 * Example 4:
 *
 *
 * Input: 45
 * Output: false
 *
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
class Solution_isPowerOfThree_0 {
    fun isPowerOfThree(n: Int): Boolean = when (n) {
        0, 2 -> false
        1 -> true
        else -> (n % 3) == 0 && isPowerOfThree(n / 3)
    }
}
