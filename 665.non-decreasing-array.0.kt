/*
 * @lc app=leetcode id=665 lang=kotlin
 *
 * [665] Non-decreasing Array
 */
class Solution_checkPossibility_0 {
fun checkPossibility(nums: IntArray): Boolean {
        if (nums.size < 3) return true

        return nums.toList().zipWithNext()
            .withIndex()
            .filter { it.value.first > it.value.second }
            .map { it.index }
            .let {
                when(it.size) {
                    0 -> true
                    1 -> it.first().let {
                        when (it) {
                            0, nums.size - 2 -> true
                            else -> nums[it + 1] - nums[it - 1] > 0 || nums[it + 2] - nums[it] > 0
                        }
                    }
                    else -> false
                }
            }
    }
}
