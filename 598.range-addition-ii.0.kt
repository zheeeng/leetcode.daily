/*
 * @lc app=leetcode id=598 lang=kotlin
 *
 * [598] Range Addition II
 */
class Solution_maxCount_0 {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        if (ops.size == 0) return m * n
        return ops.map { it[0] }.min()!! * ops.map { it[1] }.min()!!
    }
}
