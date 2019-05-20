/*
 * @lc app=leetcode id=657 lang=kotlin
 *
 * [657] Robot Return to Origin
 */
class Solution_judgeCircle_0 {
    fun judgeCircle(moves: String): Boolean {
        return moves.fold(Pair(0, 0)) { (h, v), move ->
            when (move) {
                'U' -> Pair(h, v + 1)
                'D' -> Pair(h, v - 1)
                'L' -> Pair(h - 1, v)
                'R' -> Pair(h + 1, v)
                else -> Pair(h, v)
            }
        }.let { it.first == 0 && it.second == 0 }
    }
}
