/*
 * @lc app=leetcode id=888 lang=kotlin
 *
 * [888] Fair Candy Swap
 */
class Solution_fairCandySwap_0 {
    fun fairCandySwap(A: IntArray, B: IntArray): IntArray {
        val sumA = A.sum()
        val sumB = B.sum()
        A.forEach { vA ->
            val vB = B.find { vB -> (vA - vB) * 2 == sumA - sumB }
            if (vB != null) {
                return intArrayOf(vA, vB)
            }
        }
        return intArrayOf()
    }
}
