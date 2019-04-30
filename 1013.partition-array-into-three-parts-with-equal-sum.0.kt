/*
 * @lc app=leetcode id=1013 lang=kotlin
 *
 * [1013] Partition Array Into Three Parts With Equal Sum
 */
class Solution_canThreePartsEqualSum_0 {
    fun canThreePartsEqualSum(A: IntArray): Boolean {
        val targetSum = A.sum() / 3

        return A.fold(Pair(0, 0)) { (total, count), v ->
            val t = total + v
            if (t == targetSum) Pair(0, count + 1) else Pair(t, count)
        }.second == 3
    }
}
