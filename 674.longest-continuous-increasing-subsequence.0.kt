/*
 * @lc app=leetcode id=674 lang=kotlin
 *
 * [674] Longest Continuous Increasing Subsequence
 */
class Solution_findLengthOfLCIS_0 {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if (nums.size == 0) return 0
        return nums.drop(1).fold(Triple(1, 1, nums[0])) { (gMax, cMax, lastV), v ->
            val nextCMax = if (v > lastV) (cMax + 1) else 1
            val nextGMax = if (nextCMax > gMax) nextCMax else gMax
            Triple(nextGMax, nextCMax, v)
        }.first
    }
}
