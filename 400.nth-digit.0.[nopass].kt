/*
 * @lc app=leetcode id=400 lang=kotlin
 *
 * [400] Nth Digit
 */
// Time Limit Exceeded
class Solution_findNthDigit_0 {
    fun findNthDigit(n: Int): Int {
        return generateSequence(0) { it + 1}
            .flatMap { it.toString().map { it.toString().toInt() }.asSequence() }
            .elementAt(n)
    }
}
