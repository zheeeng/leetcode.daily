/*
 * @lc app=leetcode id=42 lang=kotlin
 *
 * [42] Trapping Rain Water
 */
class Solution_trap_0 {
    fun trap(height: IntArray): Int {
        val indexedHeight = height.withIndex()
        val indicesFromLeft = generateSequence(0) { lastIndex ->
            indexedHeight
                .indexOfFirst { it.index > lastIndex && it.value >= height[lastIndex] }
                .takeIf { it != -1 }
        }.toList()

        val midIndex = indicesFromLeft.lastOrNull()?: 0

        val indicesFromRight = generateSequence(height.size - 1) { lastIndex ->
        	indexedHeight
            	.indexOfLast { it.index < lastIndex && it.value >= height[lastIndex] && it.index >=  midIndex }
                .takeIf { it != -1 }
        }.toList()

        return indicesFromLeft.zipWithNext().fold(0) { acc, (index1, index2) ->
            acc + height[index1] * (index2 - index1 - 1) - height.slice(index1 + 1 until index2).sum()
        } + indicesFromRight.zipWithNext().fold(0) { acc, (index1, index2) ->
            acc + height[index1] * (index1 - index2 - 1) - height.slice(index2 + 1 until index1).sum()
        }
    }
}
