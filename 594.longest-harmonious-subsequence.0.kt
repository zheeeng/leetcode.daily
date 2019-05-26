/*
 * @lc app=leetcode id=594 lang=kotlin
 *
 * [594] Longest Harmonious Subsequence
 */
class Solution_findLHS_0 {
    fun findLHS(nums: IntArray): Int {
        var m = mutableMapOf<Int, List<Int>>()

        nums.forEach {
            m.set(it, m.getOrPut(it, { listOf<Int>() }) + it)
            m.set(it + 1, m.getOrPut(it + 1, { listOf<Int>() }) + it)
        }

        return m.values
            .filter { list -> list.size > 1 && list.any { it != list.first() } }
            .maxBy { it.size }?.size?: 0
    }
}
