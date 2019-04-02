/*
 * @lc app=leetcode id=125 lang=golang
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (30.55%)
 * Total Accepted:    334.7K
 * Total Submissions: 1.1M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 *
 * Example 1:
 *
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: "race a car"
 * Output: false
 *
 *
 */
func isPalindrome(s string) bool {
	l := len(s)
	for i, j := 0, l-1; i < j; {
		for ; !isAlpha(rune(s[i])) && i < j; i++ {
		}
		for ; !isAlpha(rune(s[j])) && j > i; j-- {
		}

		if i == j {
			return true
		}

		if !isSame(rune(s[i]), rune(s[j])) {
			return false
		}

		i++
		j--
	}

	return true
}

func isAlpha(i rune) bool {
	return (i > 64 && i <= 90) || (i > 96 && i <= 122) || (i >= 48 && i <= 57)
}

func isSame(i, j rune) bool {
	return (i == j) || (i > 64 && i+32 == j) || (j > 64 && j+32 == i)
}

