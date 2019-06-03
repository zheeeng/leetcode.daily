/*
 * @lc app=leetcode id=459 lang=kotlin
 *
 * [459] Repeated Substring Pattern
 */
class Solution_repeatedSubstringPattern_0 {
    fun repeatedSubstringPattern(s: String): Boolean {
        val l = s.length

        if (l == 1) return false

        if (s.toSet().size == 1) return true

        return (2..l / 2).dropWhile { l % it != 0 || s.slice(0 until l/it).repeat(it) != s }.size > 0
    }
}
