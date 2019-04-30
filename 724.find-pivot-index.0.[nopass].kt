/*
 * @lc app=leetcode id=724 lang=kotlin
 *
 * [724] Find Pivot Index
 */
// Time Limit Exceeded
class Solution_pivotIndex_0 {
    fun pivotIndex(nums: IntArray): Int {
        nums.forEachIndexed { i, _ ->
            if (nums.take(i).sum() == nums.drop(i + 1).sum()) return i
        }
        return -1
    }
}
