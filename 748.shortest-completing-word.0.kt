/*
 * @lc app=leetcode id=748 lang=kotlin
 *
 * [748] Shortest Completing Word
 */
class Solution_shortestCompletingWord_0 {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val oc = licensePlate.filter { it.isLetter() }.map { it.toLowerCase() }
            .groupingBy { it }.eachCount()

        return words.filter {
            it.groupingBy { it }.eachCount().let { e -> oc.all { e.get(it.key)?: 0 >= it.value } }
        }.let {
            val minLength = it.map { it.length }.min() ?: it.firstOrNull()?.length ?: 0
            it.filter { it.length == minLength }
        }.firstOrNull() ?: ""
    }
}
