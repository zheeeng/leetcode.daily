/*
 * @lc app=leetcode id=389 lang=kotlin
 *
 * [389] Find the Difference
 */
class Solution_findTheDifference_0 {
    fun findTheDifference(s: String, t: String): Char {
        return t.toList().sorted().zip(s.toList().sorted().let {it + '-' }).find { it.first != it.second }!!.first
    }
}
