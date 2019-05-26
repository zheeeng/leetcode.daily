/*
 * @lc app=leetcode id=581 lang=kotlin
 *
 * [581] Shortest Unsorted Continuous Subarray
 */
// TEL
class Solution_findUnsortedSubarray_0 {
    fun findUnsortedSubarray(nums: IntArray): Int {
        val indexedNums = nums.withIndex()
        val fromLeft = indexedNums.map { indexedNum ->
        	indexedNums
                .indexOfFirst { it.index > indexedNum.index && it.value < indexedNum.value }
                .let { Pair(indexedNum.index, it) }
        }.also(::println).find { it.second != -1 }
        val fromRight = indexedNums.map { indexedNum ->
            indexedNums
                .indexOfLast { it.index < indexedNum.index && it.value > indexedNum.value }
                .let { Pair(indexedNum.index, it) }
        }.also(::println).findLast { it.second != -1 }

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
