/*
 * @lc app=leetcode id=168 lang=golang
 *
 * [168] Excel Sheet Column Title
 *
 * https://leetcode.com/problems/excel-sheet-column-title/description/
 *
 * algorithms
 * Easy (28.68%)
 * Total Accepted:    168.5K
 * Total Submissions: 585.4K
 * Testcase Example:  '1'
 *
 * Given a positive integer, return its corresponding column title as appear in
 * an Excel sheet.
 *
 * For example:
 *
 *
 * ⁠   1 -> A
 * ⁠   2 -> B
 * ⁠   3 -> C
 * ⁠   ...
 * ⁠   26 -> Z
 * ⁠   27 -> AA
 * ⁠   28 -> AB
 * ⁠   ...
 *
 *
 * Example 1:
 *
 *
 * Input: 1
 * Output: "A"
 *
 *
 * Example 2:
 *
 *
 * Input: 28
 * Output: "AB"
 *
 *
 * Example 3:
 *
 *
 * Input: 701
 * Output: "ZY"
 *
 */
func convertToTitle(n int) string {
	baseChar := 'A'
	chars := []int{}
	for n != 0 {
		chars = append(chars, (n-1)%26)
		n = (n - 1) / 26
	}
	ret := ""
	lc := len(chars)
	for i := range chars {
		ci := chars[lc-i-1]
		ret += string(rune(ci) + baseChar)
	}
	return ret
}
