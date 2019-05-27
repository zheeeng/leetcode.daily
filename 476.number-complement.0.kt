/*
 * @lc app=leetcode id=476 lang=kotlin
 *
 * [476] Number Complement
 */
class Solution_findComplement_0 {
    fun findComplement(num: Int): Int {
        return num.toString(2).map {
            when (it) {
                '1' -> '0'
                else -> '1'
            }
        }.joinToString("").toInt(2)
    }
}
