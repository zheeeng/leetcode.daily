/*
 * @lc app=leetcode id=441 lang=kotlin
 *
 * [441] Arranging Coins
 */
import kotlin.math.sqrt

// Over precision
class Solution_arrangeCoins_0 {
    fun arrangeCoins(n: Int): Int {
        return ((-1 + sqrt((1 + 8 * n).toDouble())) / 2).toInt()
    }
}
