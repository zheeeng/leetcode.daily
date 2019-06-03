/*
 * @lc app=leetcode id=453 lang=kotlin
 *
 * [453] Minimum Moves to Equal Array Elements
 */
class Solution_minMoves_0 {
    fun minMoves(nums: IntArray): Int {
        val m = nums.min()!!
        return nums.map { it - m }.sum()
    }
}
