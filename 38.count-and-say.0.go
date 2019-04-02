/*
 * @lc app=leetcode id=38 lang=golang
 *
 * [38] Count and Say
 *
 * https://leetcode.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (39.83%)
 * Total Accepted:    268.1K
 * Total Submissions: 672.1K
 * Testcase Example:  '1'
 *
 * The count-and-say sequence is the sequence of integers with the first five
 * terms as following:
 *
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the n^th term of the
 * count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a
 * string.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: 1
 * Output: "1"
 *
 *
 * Example 2:
 *
 *
 * Input: 4
 * Output: "1211"
 *
 */
import (
	"strconv"
)

func interpret(numStr string) string {
	ret := ""
	count := 1
	n := numStr[0]
	l := len(numStr)
	for i := 1; i < l; i++ {
		if numStr[i] == n {
			count++
		} else {
			ret += strconv.Itoa(count) + string(n)
			count = 1
			n = numStr[i]
		}
	}
	return ret + strconv.Itoa(count) + string(n)
}

func countAndSay(n int) string {
	interpretted := "1"
	for i := 0; i < n-1; i++ {
		interpretted = interpret(interpretted)
	}
	return interpretted
}
