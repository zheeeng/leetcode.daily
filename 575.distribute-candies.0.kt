/*
 * @lc app=leetcode id=575 lang=kotlin
 *
 * [575] Distribute Candies
 */
class Solution_distributeCandies_0 {
    fun distributeCandies(candies: IntArray): Int {
        val s = candies.size / 2
        val countMap = candies.groupBy { it }.mapValues { it.value.size }
        if (countMap.size > s) return s

        return countMap.size
    }
}
