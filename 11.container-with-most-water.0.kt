/*
 * @lc app=leetcode id=11 lang=kotlin
 *
 * [11] Container With Most Water
 */
import kotlin.math.min

class Solution_maxArea_0 {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var h = height.size - 1

        var max = (h - l) * min(height[l], height[h])

        while (l < h) {
            if (height[l] > height[h]) {
                val tmp = height[h]
                while (height[h] <= tmp && l < h) {
                    h--
                }
                val m = (h - l) * min(height[l], height[h])
                if (m > max) {
                    max = m
                }
            } else {
                val tmp = height[l]
                while (height[l] <= tmp && l < h) {
                    l++
                }
                val m = (h - l) * min(height[l], height[h])
                if (m > max) {
                    max = m
                }
            }
        }

        return max
    }
}
