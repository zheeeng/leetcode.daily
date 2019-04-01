/*
 * @lc app=leetcode id=28 lang=golang
 *
 * [28] Implement strStr()
 *
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * algorithms
 * Easy (31.48%)
 * Total Accepted:    399.9K
 * Total Submissions: 1.3M
 * Testcase Example:  '"hello"\n"ll"'
 *
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 *
 * Example 1:
 *
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 *
 * Example 2:
 *
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great
 * question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty
 * string. This is consistent to C's strstr() and Java's indexOf().
 *
 */
func strStr(haystack string, needle string) int {
	hl := len(haystack)
	nl := len(needle)

	if haystack == needle || nl == 0 {
		return 0
	}

	if hl < nl {
		return -1
	}

	fl := needle[0]

	for i := range haystack {
		if i+nl > hl {
			return -1
		}
		if haystack[i] == fl && string(haystack[i:i+nl]) == needle {
			return i
		}
	}

	return -1
}

