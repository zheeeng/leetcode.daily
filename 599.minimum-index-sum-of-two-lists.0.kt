/*
 * @lc app=leetcode id=599 lang=kotlin
 *
 * [599] Minimum Index Sum of Two Lists
 */
class Solution_findRestaurant_0 {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        return list1.toSet().intersect(list2.toSet())
            .map { Pair(it, list1.indexOf(it) + list2.indexOf(it)) }
            .sortedBy { it.second }
            .let { list ->
                list.takeWhile { it.second == list[0].second }
            }
            .map { it.first }
            .toTypedArray()
    }
}
