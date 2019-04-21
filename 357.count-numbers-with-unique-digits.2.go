/*
 * @lc app=leetcode id=357 lang=golang
 *
 * [357] Count Numbers with Unique Digits
 *
 * https://leetcode.com/problems/count-numbers-with-unique-digits/description/
 *
 * algorithms
 * Medium (46.71%)
 * Total Accepted:    60.2K
 * Total Submissions: 128.7K
 * Testcase Example:  '2'
 *
 * Given a non-negative integer n, count all numbers with unique digits, x,
 * where 0 ≤ x < 10^n.
 *
 *
 * Example:
 *
 *
 * Input: 2
 * Output: 91
 * Explanation: The answer should be the total numbers in the range of 0 ≤ x <
 * 100,
 * excluding 11,22,33,44,55,66,77,88,99
 *
 *
 */
// import (
//     "math"
// )
var cache = map[int]int{
	9: 9,
}

func factorialFrom9(n int) int {
	if v, ok := cache[n]; ok {
		return v
	}
	ret := n * factorialFrom9(n+1)
	cache[n] = ret
	return ret
}

func countNumbersWithUniqueDigits(n int) (ret int) {
	if n == 0 {
		return 1
	}
	if n == 1 {
		return 10
	}
	return factorialFrom9(11-n)*9 + countNumbersWithUniqueDigits(n-1)
}
