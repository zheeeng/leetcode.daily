/*
 * @lc app=leetcode id=944 lang=kotlin
 *
 * [944] Delete Columns to Make Sorted
 */
class Solution {
    fun transpose(A: List<String>): List<String> {
        val cols = A[0].length
        return A.fold(Array(cols) { "" }.toList()) { list, str ->
            list.zip(str.split("").toList().drop(1).take(cols)) { a, b -> a + b }
        }
    }
    fun minDeletionSize(A: Array<String>): Int {
        val cols = A[0].length

        val B = transpose(A.toList())
        return cols - B.filter { it.zipWithNext().all { (p, c) -> c >= p } }.count()
    }
}
