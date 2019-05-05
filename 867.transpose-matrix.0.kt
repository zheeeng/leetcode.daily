/*
 * @lc app=leetcode id=867 lang=kotlin
 *
 * [867] Transpose Matrix
 */
class Solution {
    fun transpose(A: Array<IntArray>): Array<IntArray> {
        val cols = A[0].size

        return A.fold(List<IntArray>(cols) { IntArray(0) } ) { list, arr ->
            list.zip(arr.toList()) { a, b -> a + b }
        }.toTypedArray()
    }
}
