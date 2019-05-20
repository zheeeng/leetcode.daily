/*
 * @lc app=leetcode id=521 lang=kotlin
 *
 * [521] Longest Uncommon Subsequence I
 */
class Solution_findLUSlength_0 {
    fun findLUSlength(a: String, b: String): Int {
        return if (a == b) -1 else a.length.let { if (it > b.length) it else b.length }
    }
}
