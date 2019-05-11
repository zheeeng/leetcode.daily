/*
 * @lc app=leetcode id=258 lang=kotlin
 *
 * [258] Add Digits
 */
class Solution_addDigits_0 {
    fun toNumericValues (num: Int) =
        num.toString().map(Character::getNumericValue)
    fun addDigits(num: Int): Int {
        return generateSequence(num) {
            if (it >= 10) toNumericValues(it).sum() else null
        }.last()
    }
}
