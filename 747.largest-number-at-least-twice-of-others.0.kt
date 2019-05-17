/*
 * @lc app=leetcode id=747 lang=kotlin
 *
 * [747] Largest Number At Least Twice of Others
 */
class Solution_dominantIndex_0 {
    fun dominantIndex(nums: IntArray): Int {
        if (nums.size == 1) return 0
        return nums.foldIndexed(Pair(0, 1).let { if (nums[1] > nums[0]) Pair(1, 0) else it }) { index, (maxIndex1, maxIndex2), num ->
            when {
                index in 0..1 || num < nums[maxIndex2] -> Pair(maxIndex1, maxIndex2)
                num < nums[maxIndex1] -> Pair(maxIndex1, index)
                else -> Pair(index, maxIndex1)
            }
        }.let { (maxIndex1, maxIndex2) -> if (nums[maxIndex1] >= 2 * nums[maxIndex2]) maxIndex1 else -1 }
    }
}
