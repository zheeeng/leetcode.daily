/*
 * @lc app=leetcode id=643 lang=kotlin
 *
 * [643] Maximum Average Subarray I
 */
class Solution_findMaxAverage_0 {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val seed = nums.take(k).sum().let { Pair(it, it) }
        return nums.withIndex().drop(k).fold(seed) { (sum, max), cur ->
            (sum + cur.value - nums[cur.index - k]).let { if (it > max) Pair(it, it) else Pair(it, max) }
        }.let { it.second.toDouble() / k }
    }
}
