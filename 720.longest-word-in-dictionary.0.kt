/*
 * @lc app=leetcode id=720 lang=kotlin
 *
 * [720] Longest Word in Dictionary
 */
class Solution {
    fun longestWord(words: Array<String>): String {
        return words.filter { word ->
            word.mapIndexed { i, _ ->
                word.take(i)
            }.drop(1).all { words.contains(it) }
        }.sorted().reversed().sortedBy { it.length } .last()
    }
}
