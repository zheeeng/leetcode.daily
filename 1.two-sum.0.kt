/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (42.72%)
 * Total Accepted:    1.6M
 * Total Submissions: 3.8M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * Example:
 *
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *
 *
 *
 */
class Solution_twoSum_0 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, int ->
            nums.drop(index + 1).forEachIndexed { index2, int2 ->
                if (int + int2 == target) return intArrayOf(index, index + 1 + index2)
            }
        }
        return intArrayOf()
    }
}
