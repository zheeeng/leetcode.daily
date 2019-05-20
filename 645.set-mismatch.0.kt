/*
 * @lc app=leetcode id=645 lang=kotlin
 *
 * [645] Set Mismatch
 */
class Solution_findErrorNums_0 {
    fun findErrorNums(nums: IntArray): IntArray {
        val sum = (1 + nums.size) * nums.size / 2
        val dis = sum - nums.sum()
        val mis = sum - nums.toSet().sum()
        return intArrayOf(mis - dis, mis)
    }
}
