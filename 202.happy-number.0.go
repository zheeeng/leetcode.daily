/*
 * @lc app=leetcode id=202 lang=golang
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 * algorithms
 * Easy (44.60%)
 * Total Accepted:    224.9K
 * Total Submissions: 501.8K
 * Testcase Example:  '19'
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 */
func calculate(n int) (ret int) {
	for n != 0 {
		m := n % 10
		ret += m * m
		n /= 10
	}
	return
}
func isHappy(n int) bool {
	for n >= 10 {
		n = calculate(n)
	}

	if n == 1 || n == 7 {
		return true
	}
	return false
}
