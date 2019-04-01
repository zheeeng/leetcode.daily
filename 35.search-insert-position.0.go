/*
 * @lc app=leetcode id=35 lang=golang
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (40.57%)
 * Total Accepted:    376.8K
 * Total Submissions: 928.3K
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 *
 * Example 2:
 *
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 *
 *
 * Example 3:
 *
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 *
 *
 * Example 4:
 *
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 *
 */
func searchInsert(nums []int, target int) int {
	l := len(nums)

	if l < 0 {
		return 0
	}

	if target > nums[l-1] {
		return l
	}

	min := nums[0]
	minIndex := 0
	nextMinIndex := 0
	nextMin := 0

	for target > min {
		nextMinIndex = int(1 << uint(minIndex))
		if nextMinIndex > l-1 {
			nextMinIndex = l - 1
		}
		nextMin = nums[nextMinIndex]

		if target <= nextMin && target > nums[nextMinIndex-1] {
			return nextMinIndex
		}

		if target < nextMin {
			return minIndex + searchInsert(nums[minIndex:nextMinIndex], target)
		}

		minIndex = nextMinIndex
		min = nextMin
	}

	return minIndex
}
