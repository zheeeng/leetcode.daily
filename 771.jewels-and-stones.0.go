/*
 * @lc app=leetcode id=771 lang=golang
 *
 * [771] Jewels and Stones
 *
 * https://leetcode.com/problems/jewels-and-stones/description/
 *
 * algorithms
 * Easy (82.87%)
 * Total Accepted:    214.2K
 * Total Submissions: 258.5K
 * Testcase Example:  '"aA"\n"aAAbbbb"'
 *
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have.  Each character in S is a type of stone
 * you have.  You want to know how many of the stones you have are also
 * jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type
 * of stone from "A".
 *
 * Example 1:
 *
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 *
 * Example 2:
 *
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 *
 * Note:
 *
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 *
 */
func numJewelsInStones(J string, S string) int {
	jm := make(map[rune]struct{}, len(J))
	for _, j := range J {
		jm[j] = struct{}{}
	}

	count := 0
	for _, s := range S {
		if _, ok := jm[s]; ok {
			count++
		}
	}

	return count
}

