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
class SumSequence(a: Int, b: Int) : Iterator<Int> {
    var aa: Int
    var bb: Int

    init {
        aa = a
        bb = b
    }

    override fun hasNext() = bb != 0

    override fun next(): Int {
        aa = (aa xor bb).also {
            bb = (aa and bb) shl 1
        }
        return aa
    }
}

class Solution_getSum_1 {
    fun getSum(a: Int, b: Int): Int {
        val seq = SumSequence(a, b)
        var `val` = 0
        for (v in seq) {
            `val` = v
        }
        return `val`
    }
}
