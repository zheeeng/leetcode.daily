/*
 * @lc app=leetcode id=728 lang=kotlin
 *
 * [728] Self Dividing Numbers
 */
class Solution_selfDividingNumbers_0 {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        return (left..right).filter { num ->
            num.toString().map(Character::getNumericValue).all { it != 0 && num % it == 0 }
        }
    }
}
