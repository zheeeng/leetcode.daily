/*
 * @lc app=leetcode id=696 lang=kotlin
 *
 * [696] Count Binary Substrings
 */
class Solution_countBinarySubstrings_2 {
    fun countBinarySubstrings(s: String): Int {
        var counts = mutableListOf<Int>()
        var last = s[0]
        var lastCount = 1
        (1 until s.length).forEach {
            if (s[it] == last) {
                lastCount++
            } else {
                counts.add(lastCount)
                last = s[it]
                lastCount = 1
            }
        }

        counts.add(lastCount)

        return counts.zipWithNext().map { if (it.first > it.second) it.second else it.first }.sum()
    }
}
