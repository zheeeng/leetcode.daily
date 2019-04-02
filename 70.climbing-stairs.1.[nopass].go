/*
 * @lc app=leetcode id=70 lang=golang
 *
 * [70] Climbing Stairs
 *
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (43.76%)
 * Total Accepted:    375.5K
 * Total Submissions: 858.2K
 * Testcase Example:  '2'
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 *
 * Example 2:
 *
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 */
import (
	"math"
)

func g(n int) int {
	sqrt5 := math.Sqrt(5)
	return int((1.0 / sqrt5) * (math.Pow((1+sqrt5)/2, float64(n)) - math.Pow((1-sqrt5)/2, float64(n))))
}

// s(n) = s(n - 1) + s(n - 2)
//      = 2s(n - 2) + s(n - 3)
//      = 3s(n - 3) + 2s(n - 4)
//      = 5s(n - 4) + 3s(n - 5)
//      = 8s(n - 5) + 5s(n - 6)
// Note: fail on precision
func climbStairs(n int) int {
	if n == 1 {
		return 1
	}
	if n == 2 {
		return 2
	}
	if n == 3 {
		return 3
	}

	if n%2 == 0 {
		return g(n-2)*climbStairs(3) + g(n-3)*climbStairs(2)
	}

	return g(n-1)*climbStairs(2) + g(n-2)*climbStairs(1)
}

