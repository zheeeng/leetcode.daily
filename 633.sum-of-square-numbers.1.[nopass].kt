/*
 * @lc app=leetcode id=633 lang=kotlin
 *
 * [633] Sum of Square Numbers
 */
import kotlin.math.sqrt

// Time Limit Exceeded
class Solution_judgeSquareSum_1 {
    fun judgeSquareSum(c: Int): Boolean {
        val s = (sqrt(c.toDouble())).toInt()

        (0..s).forEach { i ->
            (i..s).forEach { j ->
                if (i * i + j * j == c) return true
            }
        }
        return false
    }
}
