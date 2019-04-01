/*
 * @lc app=leetcode id=14 lang=golang
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.15%)
 * Total Accepted:    431.1K
 * Total Submissions: 1.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 *
 * Example 2:
 *
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 */
func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}
	if len(strs) == 1 {
		return strs[0]
	}

	cp := ""

	// Find out minimum str length
	str1, strsRest := strs[0], strs[1:]
	minLen := len(str1)
	for _, str := range strsRest {
		ml := len(str)
		if ml < minLen {
			minLen = ml
		}
	}

	if minLen == 0 {
		return ""
	}

	for i := range str1 {
		c := str1[i]
		for _, str := range strsRest {
			if str[i] != c {
				return cp
			}
		}

		cp += string(c)

		if i == minLen-1 {
			return cp
		}
	}

	return cp
}


