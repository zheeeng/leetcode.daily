/*
 * @lc app=leetcode id=34 lang=kotlin
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution_searchRange_0 {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.size == 0) {
            return intArrayOf(-1, -1)
        }

        var l = 0
        var h = nums.size - 1

        var m = (l + h) / 2
		var v = nums[m]

		while (l <= h){
            var m = (l + h) / 2
            if (nums[m] >= target) {
                h = m - 1
            } else {
                l = m + 1
            }
        }

        var left = l
        h = nums.size - 1

        while (l <= h) {
            var m = (l + h) / 2
            if (nums[m] > target) {
                h = m - 1
            } else {
                l = m + 1
            }
        }

        if (left == l) return intArrayOf(-1, -1)

        return intArrayOf(left, l - 1)
    }
}
