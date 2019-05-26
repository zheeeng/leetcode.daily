/*
 * @lc app=leetcode id=500 lang=kotlin
 *
 * [500] Keyboard Row
 */
class Solution_findWords_0 {
    fun inSameRow(s: String): Boolean {
        val q = "qwertyuiop"
        val a = "asdfghjkl"
        val z = "zxcvbnm"

        return s.all { q.contains(it) } || s.all { a.contains(it) } || s.all { z.contains(it) }
    }

    fun findWords(words: Array<String>): Array<String> {
        return words
            .filter { inSameRow(it.toLowerCase()) }
            .toTypedArray()
    }
}
