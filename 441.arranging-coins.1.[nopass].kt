/*
 * @lc app=leetcode id=441 lang=kotlin
 *
 * [441] Arranging Coins
 */
// TEL
class Solution {
    fun arrangeCoins(n: Int): Int {
        return generateSequence(Pair(0, 0)) { (acc, base) ->
            Pair(acc + base + 1, base + 1).takeIf { it.first <= n }
        }.last().second
    }
}
