/*
 * @lc app=leetcode id=205 lang=golang
 *
 * [205] Isomorphic Strings
 *
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (36.94%)
 * Total Accepted:    196.4K
 * Total Submissions: 530K
 * Testcase Example:  '"egg"\n"add"'
 *
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 *
 * Example 1:
 *
 *
 * Input: s = "egg", t = "add"
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example 3:
 *
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 * Note:
 * You may assume both s and t have the same length.
 *
 */
func isIsomorphic(s string, t string) bool {
	for i, c1 := range s {
		for j, c2 := range s {
			if c1 == c2 && i != j {
				if t[i] != t[j] {
					return false
				}
			}
		}
	}
	for i, c1 := range t {
		for j, c2 := range t {
			if c1 == c2 && i != j {
				if s[i] != s[j] {
					return false
				}
			}
		}
	}
	return true
}
