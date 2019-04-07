/*
 * @lc app=leetcode id=371 lang=kotlin
 *
 * [371] Sum of Two Integers
 *
 * https://leetcode.com/problems/sum-of-two-integers/description/
 *
 * algorithms
 * Easy (51.07%)
 * Total Accepted:    129K
 * Total Submissions: 252.6K
 * Testcase Example:  '1\n2'
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use
 * the operator + and -.
 *
 *
 * Example 1:
 *
 *
 * Input: a = 1, b = 2
 * Output: 3
 *
 *
 *
 * Example 2:
 *
 *
 * Input: a = -2, b = 3
 * Output: 1
 *
 *
 *
 *
 */
private fun <T> Sequence<T>.takeWhileInclusive(pred: (T) -> Boolean): Sequence<T> {
    var shouldContinue = true
    return takeWhile {
        val result = shouldContinue
        shouldContinue = pred(it)
        result
    }
}

class Solution_getSum_3 {
    fun getSum(a: Int, b: Int): Int {
        val seq = generateSequence(a to b) { (aa, bb) -> (aa xor bb) to ((aa and bb) shl 1) }
            .takeWhileInclusive { it.second != 0 }
            .map { it.first }

        return seq.last()
    }
}
