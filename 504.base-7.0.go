/*
 * @lc app=leetcode id=504 lang=golang
 *
 * [504] Base 7
 *
 * https://leetcode.com/problems/base-7/description/
 *
 * algorithms
 * Easy (44.73%)
 * Total Accepted:    39.6K
 * Total Submissions: 88.6K
 * Testcase Example:  '100'
 *
 * Given an integer, return its base 7 string representation.
 *
 * Example 1:
 *
 * Input: 100
 * Output: "202"
 *
 *
 *
 * Example 2:
 *
 * Input: -7
 * Output: "-10"
 *
 *
 *
 * Note:
 * The input will be in range of [-1e7, 1e7].
 *
 */
import (
	"strconv"
)

func convertToBase7(num int) string {
	if num == 0 {
		return "0"
	}

	factor := ""
	if num < 0 {
		factor = "-"
		num = -num
	}

	mul := 1
	ret := ""
	mod := 0

	for num != 0 {
		mod = num % (7 * mul)
		ret = strconv.Itoa(mod/mul) + ret
		num -= mod
		mul *= 7
	}
	return factor + ret
}
