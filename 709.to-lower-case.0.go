/*
 * @lc app=leetcode id=709 lang=golang
 *
 * [709] To Lower Case
 *
 * https://leetcode.com/problems/to-lower-case/description/
 *
 * algorithms
 * Easy (76.41%)
 * Total Accepted:    92.3K
 * Total Submissions: 120.7K
 * Testcase Example:  '"Hello"'
 *
 * Implement function ToLowerCase() that has a string parameter str, and
 * returns the same string in lowercase.
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: "Hello"
 * Output: "hello"
 *
 *
 *
 * Example 2:
 *
 *
 * Input: "here"
 * Output: "here"
 *
 *
 *
 * Example 3:
 *
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 *
 *
 *
 *
 */
func toLower(c rune) rune {
	if c >= 65 && c <= 90 {
		return c + 32
	}
	return c
}
func toLowerCase(str string) string {
	chars := []rune{}
	for _, c := range str {
		chars = append(chars, toLower(c))
	}

	return string(chars)
}
