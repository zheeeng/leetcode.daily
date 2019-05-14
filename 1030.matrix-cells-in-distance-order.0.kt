/*
 * @lc app=leetcode id=1030 lang=kotlin
 *
 * [1030] Matrix Cells in Distance Order
 */
class Solution_allCellsDistOrder_0 {
    fun allCellsDistOrder(R: Int, C: Int, r0: Int, c0: Int): Array<IntArray> {
        return (0 until R).flatMap { r ->
            (0 until C).map { c -> Pair(r, c) }
        }
        .sortedBy { (r, c) -> (r - r0).let { if (it > 0) it else -it } + (c - c0).let { if (it > 0) it else -it } }
        .map { intArrayOf(it.first, it.second) }
        .toTypedArray()
    }
}
