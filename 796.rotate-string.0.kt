/*
 * @lc app=leetcode id=796 lang=kotlin
 *
 * [796] Rotate String
 *
 * https://leetcode.com/problems/rotate-string/description/
 *
 * algorithms
 * Easy (48.81%)
 * Total Accepted:    37.2K
 * Total Submissions: 76.1K
 * Testcase Example:  '"abcde"\n"cdeab"'
 *
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character
 * to the rightmost position. For example, if A = 'abcde', then it will be
 * 'bcdea' after one shift on A. Return True if and only if A can become B
 * after some number of shifts on A.
 *
 *
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 *
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 *
 *
 * Note:
 *
 *
 * A and B will have length at most 100.
 *
 *
 */
class Solution_rotateString_0 {
    fun rotateString(A: String, B: String): Boolean = when {
        A == "" && B == "" -> true
		A.length != B.length -> false
        else -> A.withIndex()
            .filter { (_, v) -> B[0] == v }
            .any { (i, _) -> A.substring(i) + A.substring(0, i) == B }
    }
}
