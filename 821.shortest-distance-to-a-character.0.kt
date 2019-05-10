/*
 * @lc app=leetcode id=821 lang=kotlin
 *
 * [821] Shortest Distance to a Character
 */
class Solution_shortestToChar_0 {
    fun shortestToChar(S: String, C: Char): IntArray {
        val charIndices = S.mapIndexed { index, c -> if (c == C) index else -1 }.filter { it != -1 }

        return S.mapIndexed { index, _ -> charIndices.map { (it - index).let { if (it < 0) (it * -1) else it } }.min()!! }.toIntArray()
    }
}
