/*
 * @lc app=leetcode id=724 lang=kotlin
 *
 * [724] Find Pivot Index
 */
class Solution_pivotIndex_1 {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()

        nums.foldIndexed(0) { i, p, c ->
            if (2 * p + c == sum) return i

            p + c
        }
        return -1
    }
}
