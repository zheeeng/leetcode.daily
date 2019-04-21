/*
 * @lc app=leetcode id=219 lang=golang
 *
 * [219] Contains Duplicate II
 *
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 *
 * algorithms
 * Easy (34.92%)
 * Total Accepted:    191.7K
 * Total Submissions: 546.9K
 * Testcase Example:  '[1,2,3,1]\n3'
 *
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 *
 *
 * Example 1:
 *
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 *
 *
 * Example 2:
 *
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 *
 *
 * Example 3:
 *
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 *
 *
 *
 *
 */
func containsNearbyDuplicate(nums []int, k int) bool {
	m := map[int][]int{}
	for i, n := range nums {
		if d, ok := m[n]; ok {
			for _, j := range d {
				if i-j <= k {
					return true
				}
			}
			m[n] = append(d, i)
		}
		m[n] = []int{i}
	}
	return false
}
