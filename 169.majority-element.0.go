/*
 * @lc app=leetcode id=169 lang=golang
 *
 * [169] Majority Element
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * algorithms
 * Easy (51.94%)
 * Total Accepted:    368.3K
 * Total Submissions: 706.4K
 * Testcase Example:  '[3,2,3]'
 *
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *
 * Example 1:
 *
 *
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 *
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 *
 */
func majorityElement(nums []int) int {
	m := map[int]int{}

	for _, n := range nums {
		if t, ok := m[n]; ok {
			m[n] = t + 1
		} else {
			m[n] = 1
		}
	}

	times := 0
	major := 0
	for n, t := range m {
		if t > times {
			times = t
			major = n
		}
	}
	return major
}
