/*
 * @lc app=leetcode id=389 lang=kotlin
 *
 * [389] Find the Difference
 */
class Solution_findTheDifference_1 {
    fun findTheDifference(s: String, t: String): Char {
        return (s + t).map { it.toInt() }.reduce { prev, curr -> prev xor curr }.toChar()
    }
}
