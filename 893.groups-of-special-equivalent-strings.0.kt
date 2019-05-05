/*
 * @lc app=leetcode id=893 lang=kotlin
 *
 * [893] Groups of Special-Equivalent Strings
 */
class Solution_numSpecialEquivGroups_0 {
    fun numSpecialEquivGroups(A: Array<String>): Int {
        return A.groupBy{
            it.toCharArray().withIndex().partition { it.index % 2 == 0 }
                .let { Pair(it.first.map { it.value }.sorted().toString(), it.second.map { it.value }.sorted().toString()) }
        }.size
    }
}
