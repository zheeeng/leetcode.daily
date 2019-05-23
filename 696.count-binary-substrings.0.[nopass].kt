/*
 * @lc app=leetcode id=696 lang=kotlin
 *
 * [696] Count Binary Substrings
 */
class Solution_countBinarySubstrings_0 {
    fun isSym(s: String): Boolean {
        return s.length % 2 == 0 &&
            s.first() != s.last() &&
            s.take(s.length / 2).all { it == s.first() } &&
            s.drop(s.length / 2).all { it == s.last() }
    }
    fun countBinarySubstrings(s: String): Int {
        return s.fold(Pair(0, listOf<String>())) { (count, processing), newChar ->
        	processing
                .filter { isSym(it + newChar) }
                .let { Pair(count + it.size, processing.map { it + newChar } + newChar.toString() ) }
        }.first
    }
}
