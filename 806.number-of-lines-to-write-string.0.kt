/*
 * @lc app=leetcode id=806 lang=kotlin
 *
 * [806] Number of Lines To Write String
 */
class Solution_numberOfLines_0 {
    fun numberOfLines(widths: IntArray, S: String): IntArray {
        return S.map { c -> widths[c - 'a'] }
            .fold(Pair(1, 0)) { (lines, units), width ->
                val u = units + width
                if (u > 100) Pair(lines + 1, width) else (if (u == 100) Pair(lines + 1, 0) else Pair(lines, u))
            }.let { intArrayOf(it.first, it.second) }
    }
}
