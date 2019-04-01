/*
 * @lc app=leetcode id=20 lang=golang
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.10%)
 * Total Accepted:    546.5K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 *
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 *
 * Input: "()"
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: "()[]{}"
 * Output: true
 *
 *
 * Example 3:
 *
 *
 * Input: "(]"
 * Output: false
 *
 *
 * Example 4:
 *
 *
 * Input: "([)]"
 * Output: false
 *
 *
 * Example 5:
 *
 *
 * Input: "{[]}"
 * Output: true
 *
 *
 */
func isValid(s string) bool {
	expected := []rune{}
	l := 0

	for _, c := range s {
		switch c {
		case '(':
			expected = append(expected, ')')
		case '[':
			expected = append(expected, ']')
		case '{':
			expected = append(expected, '}')
		case ')', ']', '}':
			l = len(expected)
			if l == 0 || expected[l-1] != c {
				return false
			}
			expected = expected[:l-1]
		}
	}

	return len(expected) == 0
}

