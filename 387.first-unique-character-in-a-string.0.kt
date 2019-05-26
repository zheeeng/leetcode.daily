/*
 * @lc app=leetcode id=387 lang=kotlin
 *
 * [387] First Unique Character in a String
 */
class Solution_firstUniqChar_0 {
    fun firstUniqChar(s: String): Int {
        return s.groupingBy { it }.eachCount()
            .filter { it.value == 1 }
            .mapValues { s.indexOf(it.key) }
            .minBy { it.value }
            ?.value
	        ?: -1
    }
}
