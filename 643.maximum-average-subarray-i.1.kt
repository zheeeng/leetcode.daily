/*
 * @lc app=leetcode id=643 lang=kotlin
 *
 * [643] Maximum Average Subarray I
 */
class Solution_findMaxAverage_1 {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        return (0..nums.size - k).map { (it..it + k - 1).map { nums[it] }.sum() }.max()!!.toDouble() / k
    }
}
