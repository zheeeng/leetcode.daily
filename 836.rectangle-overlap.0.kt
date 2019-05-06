/*
 * @lc app=leetcode id=836 lang=kotlin
 *
 * [836] Rectangle Overlap
 */
class Solution_isRectangleOverlap_0 {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        return !(rec1[0] >= rec2[2] || rec1[2] <= rec2[0] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1])
    }
}
