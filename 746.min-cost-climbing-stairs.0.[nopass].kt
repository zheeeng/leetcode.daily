/*
 * @lc app=leetcode id=746 lang=kotlin
 *
 * [746] Min Cost Climbing Stairs
 */
// Time Limit Exceeded
class Solution_minCostClimbingStairs_0 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val s = cost.size
        return when (s) {
            0 -> 0
            1 -> cost[0]
            2 -> cost.min()!!
            3 -> listOf(cost[1], cost[0] + cost[2]).min()!!
            else -> listOf(
                minCostClimbingStairs(cost.dropLast(1).toIntArray()) + cost.last(),
                minCostClimbingStairs(cost.dropLast(2).toIntArray()) + cost.elementAt(s - 2)
            ).min()!!
        }
    }
}
