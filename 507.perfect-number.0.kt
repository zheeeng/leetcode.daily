/*
 * @lc app=leetcode id=507 lang=kotlin
 *
 * [507] Perfect Number
 */
class Solution_checkPerfectNumber_0 {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num % 2 != 0) return false

        return (1..num/2 + 1).filter { num % it == 0 }.sum() == num
    }
}
