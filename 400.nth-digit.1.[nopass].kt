/*
 * @lc app=leetcode id=400 lang=kotlin
 *
 * [400] Nth Digit
 */
import kotlin.math.pow
import kotlin.math.ceil

class Solution_findNthDigit_1 {
    fun findNthDigit(n: Int): Int {
        val (count, max) = generateSequence(Pair(0, 0)) { (count, max) ->
        	(count + 1).let { Pair(it, max + (it * 10.toDouble().pow(it) * 0.9).toInt()) }.takeIf { it.second < n }
        }.last().also(::println)

        return (n - max)
            .let {
                (10.toDouble().pow(count).toInt() + (it - 1).toDouble() / (count + 1)).toInt()
                    .toString().also(::println)
                    .get((it - 1) % (count + 1)).toString().toInt()
            }
    }
}
