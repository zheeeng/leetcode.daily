/*
 * @lc app=leetcode id=496 lang=kotlin
 *
 * [496] Next Greater Element I
 */
class Solution_nextGreaterElement_0 {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val nums2Indexed = nums2.withIndex()
        return nums1
            .map { Pair(it, nums2.indexOf(it)) }
            .map { (num1, num1Index) -> nums2Indexed.find { it.index > num1Index && it.value > num1 }?.value?: -1 }
            .toIntArray()
    }
}
