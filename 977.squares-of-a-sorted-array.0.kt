/*
 * @lc app=leetcode id=977 lang=kotlin
 *
 * [977] Squares of a Sorted Array
 */
class Solution_sortedSquares_0 {
    fun sortedSquares(A: IntArray): IntArray {
        return A.map { it * it }.sorted().toIntArray()
    }
}
