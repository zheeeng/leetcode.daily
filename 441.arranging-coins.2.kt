/*
 * @lc app=leetcode id=441 lang=kotlin
 *
 * [441] Arranging Coins
 */
class Solution_arrangeCoins_0 {
    fun arrangeCoins(n: Int): Int {
        return generateSequence(Pair(n, 0)) { (num, base) ->
            Pair(num - base - 1, base + 1).takeIf { it.first >= 0 }
        }.last().second
    }
}
