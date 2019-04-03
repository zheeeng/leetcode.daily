/*
 * @lc app=leetcode id=20 lang=kotlin
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
class Solution_isValid_0 {
    fun isValid(s: String) =
        s.fold(
            mutableListOf<Char>(),
            { ca, c -> when (c) {
                '(' -> ca.add(')').let { ca }
                '[' -> ca.add(']').let { ca }
                '{' -> ca.add('}').let { ca }
                in ")]}" -> when {
                    ca.isEmpty() -> return false
                    ca.last() != c -> return false
                    else -> ca.removeAt(ca.size - 1).let { ca }
                }
                else -> return false
            } }
        ).size == 0
}
