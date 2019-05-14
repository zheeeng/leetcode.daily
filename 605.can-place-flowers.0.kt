/*
 * @lc app=leetcode id=605 lang=kotlin
 *
 * [605] Can Place Flowers
 */
class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) return true
        if (flowerbed.size == 0) return false
        val initAcc = if (flowerbed.first() == 0) 1 else 0
        val lastAcc = if (flowerbed.last() == 0) listOf(0, 1) else listOf<Int>()

        return (flowerbed.toList() + lastAcc)
        	.fold(Pair(0, initAcc)) { (count, acc), plot ->
                when (plot) {
                    0 -> Pair(count, acc + 1)
                    1 -> Pair(count + (acc - 1) / 2, 0)
                    else -> throw Exception()
                }
            }
            .first >= n
    }
}
