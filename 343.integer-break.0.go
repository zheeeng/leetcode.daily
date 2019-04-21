/*
 * @lc app=leetcode id=343 lang=golang
 *
 * [343] Integer Break
 *
 * https://leetcode.com/problems/integer-break/description/
 *
 * algorithms
 * Medium (47.48%)
 * Total Accepted:    77K
 * Total Submissions: 161.9K
 * Testcase Example:  '2'
 *
 * Given a positive integer n, break it into the sum of at least two positive
 * integers and maximize the product of those integers. Return the maximum
 * product you can get.
 *
 * Example 1:
 *
 *
 *
 * Input: 2
 * Output: 1
 * Explanation: 2 = 1 + 1, 1 × 1 = 1.
 *
 *
 * Example 2:
 *
 *
 * Input: 10
 * Output: 36
 * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 *
 * Note: You may assume that n is not less than 2 and not larger than 58.
 *
 *
 */
import (
	"math"
)

func integerBreak(n int) int {
	if n == 2 || n == 3 {
		return n - 1
	}
	twoNums := 0
	threeNums := n / 3
	if n%3 == 1 {
		twoNums = 2
		threeNums--
	}
	if n%3 == 2 {
		twoNums++
	}

	return int(math.Pow(3, float64(threeNums)) * math.Pow(2, float64(twoNums)))
}
