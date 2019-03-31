/*
 * @lc app=leetcode id=704 lang=golang
 *
 * [704] Binary Search
 *
 * https://leetcode.com/problems/binary-search/description/
 *
 * algorithms
 * Easy (46.07%)
 * Total Accepted:    39.4K
 * Total Submissions: 85.2K
 * Testcase Example:  '[-1,0,3,5,9,12]\n9'
 *
 * Given a sorted (in ascending order) integer array nums of n elements and a
 * target value, write a function to search target in nums. If target exists,
 * then return its index, otherwise return -1.
 *
 *
 * Example 1:
 *
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 *
 *
 * Example 2:
 *
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 *
 *
 * Note:
 *
 *
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 *
 *
 */
func search(nums []int, target int) int {
	l := 0
	h := len(nums)
	m := h / 2
	v := nums[m]
	for ; v != target; v = nums[m] {
		if m == l || m == h {
			return -1
		}
		if v > target {
			h, m = m, (l+m)/2
		} else {
			l, m = m, (h+m)/2
		}
	}

	return m
}
