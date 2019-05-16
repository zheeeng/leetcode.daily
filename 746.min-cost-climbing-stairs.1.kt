/*
 * @lc app=leetcode id=746 lang=kotlin
 *
 * [746] Min Cost Climbing Stairs
 */
import kotlin.math.min

class Solution_minCostClimbingStairs_0 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val seed = Pair(Pair(0, 0), Pair(1, 0))

		return generateSequence(seed) { (prev, curr) ->
            val ( prevIndex, prevMin ) = prev
            val ( currIndex, currMin ) = curr
            val nextIndex = currIndex + 1
            val prevVal = cost[prevIndex]
            val currVal = cost[currIndex]
            val nextMin = min(prevMin + prevVal, currMin + currVal)
            Pair(curr, Pair(nextIndex, nextMin))
        }.map { it.second.second }.elementAt(cost.size - 1)
    }
}
