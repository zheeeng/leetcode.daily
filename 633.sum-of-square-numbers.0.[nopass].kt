/*
 * @lc app=leetcode id=633 lang=kotlin
 *
 * [633] Sum of Square Numbers
 */
// Memory Limit Exceeded
class Solution_judgeSquareSum_0 {
    fun judgeSquareSum(c: Int): Boolean {
        val sList = generateSequence(Pair(0, 0)) { (n, s) ->
            Pair(n + 1, (n + 1) * (n + 1)).takeIf { it.second <= c }
        }.toList().map { it.second }

        return sList.any { n -> sList.any { it + n == c } }
    }
}
