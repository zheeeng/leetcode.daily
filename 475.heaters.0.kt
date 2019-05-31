/*
 * @lc app=leetcode id=475 lang=kotlin
 *
 * [475] Heaters
 */
import kotlin.math.max
import kotlin.math.min

class Solution_findRadius {
    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        val hous = houses.sorted()
        val heats = heaters.sorted()

        return hous.map { hou ->
                Pair(
                    heats.indexOfFirst { heat -> heat >= hou },
                    heats.indexOfLast { heat -> heat < hou }
                ).let {
                    when {
                        it.first == -1 && it.second == -1 -> 0
                        it.first == -1 -> hou - heats.elementAt(it.second)
                        it.second == -1 -> heats.elementAt(it.first) - hou
                        else -> min(heats.elementAt(it.first) - hou, hou - heats.elementAt(it.second))
                    }
                }
        }.max()!!
    }
}
