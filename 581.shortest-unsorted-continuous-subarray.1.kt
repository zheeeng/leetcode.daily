/*
 * @lc app=leetcode id=581 lang=kotlin
 *
 * [581] Shortest Unsorted Continuous Subarray
 */
class Solution_findUnsortedSubarray_1 {
    fun findUnsortedSubarray(nums: IntArray): Int {
        var fromLeft: Pair<Int, Int>? = null
 		var fromRight: Pair<Int, Int>? = null

		loopleft@ for (i in 0 until nums.size) {
            for (j in (i + 1) until nums.size) {
                if (nums[j] < nums[i]) {
                    fromLeft = Pair(i, j)
                    break@loopleft
                }
            }
        }

        loopright@ for (i in (nums.size - 1) downTo 0) {
            for (j in (i - 1) downTo 0) {
                if (nums[j] > nums[i]) {
                    fromRight = Pair(i, j)
                    break@loopright
                }
            }
        }

        return when {
           fromLeft == null && fromRight == null -> 0
           fromLeft != null && fromRight != null -> {
               if (fromLeft.second <= fromRight.first) {
                   fromRight.first - fromLeft.first +1
               } else {
                   fromRight.second - fromLeft.second + 1
               }
           }
           fromLeft == null -> fromRight!!.second - fromRight.first + 1
           else -> fromLeft.second - fromLeft.first + 1
        }
    }
}
