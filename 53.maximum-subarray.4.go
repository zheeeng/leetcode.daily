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

func maxSubArray(nums []int) int {
	l := len(nums)
	if l == 1 {
		return nums[0]
	}

	m := l / 2

	leftNums := nums[0:m]
	rightNums := nums[m:l]
	leftMax := maxSubArray(leftNums)
	rightMax := maxSubArray(rightNums)

	leftSegMax := nums[m-1]
	leftSegLen := len(leftNums)
	leftSegSum := 0
	for i := range leftNums {
		leftSegSum += leftNums[leftSegLen-1-i]
		if leftSegSum > leftSegMax {
			leftSegMax = leftSegSum
		}
	}

	rightSegMax := nums[m]
	rightSegSum := 0
	for i := range rightNums {
		rightSegSum += rightNums[i]
		if rightSegSum > rightSegMax {
			rightSegMax = rightSegSum
		}
	}
	mixMax := leftSegMax + rightSegMax

	if leftMax >= rightMax {
		if leftMax >= mixMax {
			return leftMax
		}
		return mixMax
	} else {
		if rightMax >= mixMax {
			return rightMax
		}
		return mixMax
	}
}
