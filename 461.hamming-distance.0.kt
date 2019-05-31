/*
 * @lc app=leetcode id=461 lang=kotlin
 *
 * [461] Hamming Distance
 */
class Solution_hammingDistance_0 {
    fun hammingDistance(x: Int, y: Int): Int {
        return x.toString(2).padStart(32, '0').zip(y.toString(2).padStart(32, '0')).filter { it.first != it.second }.size
    }
}
