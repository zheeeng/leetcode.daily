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
	0: 1,
	1: 10,
}

func countNumbersWithUniqueDigits(n int) (ret int) {
	if v, ok := cache[n]; ok {
		return v
	}
	ret = 1
	for i := 1; i < n; i++ {
		ret *= 10 - i
	}
	v := ret*9 + countNumbersWithUniqueDigits(n-1)
	cache[n] = v
	return v
}
