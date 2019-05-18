/*
 * @lc app=leetcode id=766 lang=kotlin
 *
 * [766] Toeplitz Matrix
 */
class Solution_isToeplitzMatrix_0 {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val r = matrix.size
        val c = matrix[0].size

       	(0 until r).forEach { row ->
            (0 until c).forEach { col ->
                matrix.getOrNull(row + 1)?.getOrNull(col + 1).let {
                    if (it != null && it != matrix[row][col]) return false
                }
            }
        }

        return true
    }
}
