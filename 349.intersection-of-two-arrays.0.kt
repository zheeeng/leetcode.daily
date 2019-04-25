/*
 * @lc app=leetcode id=349 lang=kotlin
 *
 * [349] Intersection of Two Arrays
 */
class Solution_intersection_0 {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val s1 = nums1.toSet()
        val s2 = nums2.toSet()
        return (s1 intersect s2).toIntArray()
    }
}
