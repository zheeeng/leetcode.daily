/*
 * @lc app=leetcode id=1037 lang=kotlin
 *
 * [1037] Valid Boomerang
 */
class Solution_isBoomerang_0 {
    fun isBoomerang(points: Array<IntArray>): Boolean {
        return points
            .drop(1)
            .map { Pair(it[0] - points[0][0], it[1] - points[0][1] ) }
            .let { it[1].second * it[0].first != it[1].first * it[0].second }
    }
}
