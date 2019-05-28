/*
 * @lc app=leetcode id=485 lang=kotlin
 *
 * [485] Max Consecutive Ones
 */
class Solution_findMaxConsecutiveOnes_0 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
       	val mums = nums.dropWhile { it != 1 }

        if (mums.size == 0) return 0

        var maxCount = 1
        var currCount = 1
        mums.drop(1).forEach {
            if (it == 1) {
                currCount++
            } else {
                currCount = 0
            }
            if (currCount > maxCount) {
                maxCount = currCount
            }
        }

        return maxCount
    }
}
