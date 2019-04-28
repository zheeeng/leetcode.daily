/*
 * @lc app=leetcode id=953 lang=kotlin
 *
 * [953] Verifying an Alien Dictionary
 */
class Solution_isAlienSorted_0 {
    fun isAlienSorted(words: Array<String>, order: String): Boolean =
        words.map { word ->
            word.map { char ->
                    order.indexOf(char).toString(26)
            }.joinToString()
        }.toList().zipWithNext().all { (p, c) ->
            p < c
        }
}
