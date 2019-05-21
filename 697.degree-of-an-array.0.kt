/*
 * @lc app=leetcode id=697 lang=kotlin
 *
 * [697] Degree of an Array
 */
class Solution_findShortestSubArray_0 {
    fun findShortestSubArray(nums: IntArray): Int {
        val ns = nums.groupBy { it }.mapValues { it.value.size }.let {
            val entry = it.maxBy { it.value }!!
            it.filter { it.value == entry.value }
        }.map { it.key }

        return ns.map { n -> nums.lastIndexOf(n) - nums.indexOf(n) + 1 }.min()!!
    }
}
