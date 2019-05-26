/*
 * @lc app=leetcode id=492 lang=kotlin
 *
 * [492] Construct the Rectangle
 */
import kotlin.math.sqrt

class Solution_constructRectangle_0 {
    fun constructRectangle(area: Int): IntArray {
        var sq = sqrt(area.toDouble()).toInt()

        while (area % sq != 0) {
            sq--
        }

        return intArrayOf(area / sq, sq)
    }
}
