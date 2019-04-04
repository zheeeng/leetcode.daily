/*
 * @lc app=leetcode id=119 lang=kotlin
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (42.62%)
 * Total Accepted:    192.1K
 * Total Submissions: 450.6K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the k^th index row of the
 * Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 *
 * Example:
 *
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 *
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 */
// Over bound
class Solution_getRow_1 {
    fun comb(a: Int, b: Int): Int =
        (b + 1..a).fold(1) { p, c -> p * c } / (2..(a - b)).fold(1) { p, c -> p * c }

    fun getRow(rowIndex: Int): List<Int> =
        List(rowIndex + 1) { comb(rowIndex, it) }
}
