/*
 * @lc app=leetcode id=118 lang=kotlin
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (45.08%)
 * Total Accepted:    237.4K
 * Total Submissions: 526.6K
 * Testcase Example:  '5'
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 *
 * Example:
 *
 *
 * Input: 5
 * Output:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 *
 *
 */
class Solution_generate_0 {
    fun generate(numRows: Int): List<List<Int>> =
        (1..numRows).fold(mutableListOf<List<Int>>()) {
            mList, index -> mList.add(
                List<Int>(index) {
                    when (it) {
                        0 -> 1
                        index - 1 -> 1
                        else -> mList[index - 2][it - 1] + mList[index - 2][it]
                    }
                }
            ).let { mList }
        }.toList<List<Int>>()
}
