/*
 * @lc app=leetcode id=171 lang=golang
 *
 * [171] Excel Sheet Column Number
 *
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 *
 * algorithms
 * Easy (51.10%)
 * Total Accepted:    214.2K
 * Total Submissions: 418.2K
 * Testcase Example:  '"A"'
 *
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 *
 * For example:
 *
 *
 * ⁠   A -> 1
 * ⁠   B -> 2
 * ⁠   C -> 3
 * ⁠   ...
 * ⁠   Z -> 26
 * ⁠   AA -> 27
 * ⁠   AB -> 28
 * ⁠   ...
 *
 *
 * Example 1:
 *
 *
 * Input: "A"
 * Output: 1
 *
 *
 * Example 2:
 *
 *
 * Input: "AB"
 * Output: 28
 *
 *
 * Example 3:
 *
 *
 * Input: "ZY"
 * Output: 701
 *
 */
import (
	"math"
)

func titleToNumber(s string) int {
	baseChar := 'A'
	chars := []rune{}
	for _, c := range s {
		chars = append(chars, c-baseChar)
	}
	num := 0
	cl := len(chars)
	for i := range chars {
		ci := chars[cl-i-1] + 1
		num += int(ci) * int(math.Pow(26, float64(i)))
	}
	return num
}
