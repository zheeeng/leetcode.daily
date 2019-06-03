/*
 * @lc app=leetcode id=447 lang=kotlin
 *
 * [447] Number of Boomerangs
 */
class Solution_numberOfBoomerangs_0 {
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
    	return points.flatMap { p1 ->
            points.map { p2 -> (p1[0] - p2[0]).let { it * it } + (p1[1] - p2[1]).let { it * it }  }
            	.filter { it != 0 }
            	.groupingBy { it }.eachCount()
                .filter { it.value > 1 }
                .toList()
                .map { it.second.let { it * (it - 1) } }
        }.sum()
    }
}
