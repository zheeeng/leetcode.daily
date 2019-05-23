/*
 * @lc app=leetcode id=696 lang=kotlin
 *
 * [696] Count Binary Substrings
 */
class Solution_countBinarySubstrings_1 {
    fun countBinarySubstrings(s: String): Int {
        return s.drop(1).fold(Pair(listOf(1), s.first())) { (counts, last), char ->
            if (char == last) {
                Pair(counts.dropLast(1) + (counts.last() + 1), last)
            } else {
                Pair(counts + listOf(1), char)
            }
        }.first.zipWithNext().map { if (it.first > it.second) it.second else it.first }.sum()
    }
}
