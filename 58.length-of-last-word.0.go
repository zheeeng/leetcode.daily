/*
 * @lc app=leetcode id=58 lang=golang
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (32.19%)
 * Total Accepted:    254.6K
 * Total Submissions: 790.7K
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 *
 */
func trim(s string) string {
    b := " "[0]
	trimSpaceCount := 0
	for i := len(s) - 1; i >= 0 && s[i] == b; i-- {
		trimSpaceCount++
	}

	if trimSpaceCount > 0 {
		s = s[:len(s)-trimSpaceCount]
    }

    return s
}

func lengthOfLastWord(s string) int {
    s = trim(s)

	if s == "" {
		return 0
    }

	b := " "[0]
	l := len(s)
	hasSpace := false
	lastIndex := 0

	for i := range s {
		if s[i] == b {
			hasSpace = true
			lastIndex = i
		}
	}

	if !hasSpace {
		return l
	}

	if lastIndex == l-1 {
		return 0
	}

	return l - lastIndex - 1
}

