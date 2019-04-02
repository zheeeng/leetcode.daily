/*
 * @lc app=leetcode id=67 lang=golang
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (38.30%)
 * Total Accepted:    286.5K
 * Total Submissions: 746.3K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 */
func addBit(a, b, c rune) (rune, rune) {
	switch string([]rune{a, b, c}) {
	case "000":
		return '0', '0'
	case "001":
		return '1', '0'
	case "010":
		return '1', '0'
	case "011":
		return '0', '1'
	case "100":
		return '1', '0'
	case "101":
		return '0', '1'
	case "110":
		return '0', '1'
	case "111":
		return '1', '1'
	}
	return '0', '0'
}

func addBinary(a string, b string) string {
	if a == "0" && b == "0" {
		return "0"
	}
	aLen, bLen := len(a), len(b)
	longLen, shortLen := aLen, bLen
	if longLen < shortLen {
		longLen, shortLen = shortLen, longLen
	}

	runes := make([]rune, longLen+1)

	r := '0'
	c := '0'
	for i := 1; i <= shortLen; i++ {
		r, c = addBit(rune(a[aLen-i]), rune(b[bLen-i]), c)
		runes[longLen-i+1] = r
	}

	if aLen > bLen {
		for i := shortLen + 1; i <= longLen; i++ {
			r, c = addBit(rune(a[aLen-i]), '0', c)
			runes[longLen-i+1] = r
		}
	} else {
		for i := shortLen + 1; i <= longLen; i++ {
			r, c = addBit('0', rune(b[bLen-i]), c)
			runes[longLen-i+1] = r
		}
	}

	runes[0] = c

	for i, c := range runes {
		if c != '0' {
			return string(runes[i:])
		}
	}

	return ""
}
