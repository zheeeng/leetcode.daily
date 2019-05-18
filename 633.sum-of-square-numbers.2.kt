/*
 * @lc app=leetcode id=633 lang=kotlin
 *
 * [633] Sum of Square Numbers
 */
import kotlin.math.sqrt

class Solution_judgeSquareSum_2 {
    fun judgeSquareSum(c: Int): Boolean {
        val s = (sqrt(c.toDouble())).toInt()

        (0..s).forEach { i ->
            val j = (sqrt((c - i * i).toDouble())).toInt()
            if (i * i + j * j == c) return true
        }

        return false
    }
}
