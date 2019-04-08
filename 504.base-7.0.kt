/*
 * @lc app=leetcode id=504 lang=kotlin
 *
 * [504] Base 7
 *
 * https://leetcode.com/problems/base-7/description/
 *
 * algorithms
 * Easy (44.73%)
 * Total Accepted:    39.6K
 * Total Submissions: 88.6K
 * Testcase Example:  '100'
 *
 * Given an integer, return its base 7 string representation.
 *
 * Example 1:
 *
 * Input: 100
 * Output: "202"
 *
 *
 *
 * Example 2:
 *
 * Input: -7
 * Output: "-10"
 *
 *
 *
 * Note:
 * The input will be in range of [-1e7, 1e7].
 *
 */
class Solution_convertToBase7_0 {
    fun convertToBase7(num: Int): String {
        var facotr = if (num < 0) "-" else ""
        var m = 1
        var n = if (num < 0) -num else num
        var bound = n / 7
        var ret = ""
        while (m <= bound) {
            n /= 7
            m *= 7
        }
        n = if (num < 0) -num else num
        while (m >= 1) {
            val v = n / m
            ret += v
            n -= v * m
            m /= 7
        }

        return facotr + ret
    }
}
