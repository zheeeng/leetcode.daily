/*
 * @lc app=leetcode id=1029 lang=kotlin
 *
 * [1029] Two City Scheduling
 */
class Solution_twoCitySchedCost_0 {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        return costs.mapIndexed { i, v -> Pair(i, v[0] - v[1]) }
            .sortedBy { it.second }
            .map { it.first }
            .take(costs.size / 2)
            .let { front -> costs.withIndex().partition { front.contains(it.index) }.let { Pair(it.first.map { it.value }, it.second.map { it.value }) } }
            .let { it.first.map { it[0] }.sum() + it.second.map { it[1] }.sum() }
    }
}
