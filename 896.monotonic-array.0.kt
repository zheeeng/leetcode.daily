/*
 * @lc app=leetcode id=896 lang=kotlin
 *
 * [896] Monotonic Array
 */
class Solution_isMonotonic_0 {
    fun isMonotonic(A: IntArray): Boolean {
        return A.toList().zipWithNext().map { (prev, curr) -> prev - curr }.let { it.all { it >= 0 } || it.all { it <= 0} }
    }
}
