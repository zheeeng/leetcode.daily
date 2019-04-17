/*
 * @lc app=leetcode id=53 lang=golang
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (43.06%)
 * Total Accepted:    490.1K
 * Total Submissions: 1.1M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 *
 */
// Time Limit Exceeded
func maxSubArray(nums []int) int {
	l := len(nums)
	max := nums[0]
	for i := 0; i < l; i++ {
		for j := i; j < l; j++ {
			localSum := 0
			for k := i; k <= j; k++ {
				localSum += nums[k]
			}
			if localSum > max {
				max = localSum
			}
		}
	}
	return max
}
