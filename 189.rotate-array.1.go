/*
 * @lc app=leetcode id=189 lang=golang
 *
 * [189] Rotate Array
 *
 * https://leetcode.com/problems/rotate-array/description/
 *
 * algorithms
 * Easy (29.41%)
 * Total Accepted:    285.3K
 * Total Submissions: 962.8K
 * Testcase Example:  '[1,2,3,4,5,6,7]\n3'
 *
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 *
 * Example 1:
 *
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 *
 * Example 2:
 *
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Note:
 *
 *
 * Try to come up as many solutions as you can, there are at least 3 different
 * ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 */
func reverse(s []int, start, end int) {
	times := end - start
	for i := times/2 - 1; i >= 0; i-- {
		opp := end - 1 - i
		s[i+start], s[opp] = s[opp], s[i+start]
	}
}
func rotate(nums []int, k int) {
	l := len(nums)
	k = k % l

	reverse(nums, 0, l-k)
	reverse(nums, l-k, l)
	reverse(nums, 0, l)
}
