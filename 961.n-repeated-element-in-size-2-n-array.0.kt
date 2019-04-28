/*
 * @lc app=leetcode id=961 lang=kotlin
 *
 * [961] N-Repeated Element in Size 2N Array
 */
class Solution {
    fun repeatedNTimes(A: IntArray): Int =
        A.toList()
            .zip(A.toList().drop(1) + A.first())
            .dropWhile {(prev, curr) ->
                if (prev == curr) {
                    return prev
                }
                true
            }.firstOrNull().let { if (it == null) (if (A[0] == A[2]) A[0] else A[1]) else it.first }
}
