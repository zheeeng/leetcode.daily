/*
 * @lc app=leetcode id=438 lang=kotlin
 *
 * [438] Find All Anagrams in a String
 */
// TLE
class Solution_findAnagrams_0 {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (p.length > s.length) return listOf<Int>()

        val ps = p.groupingBy { it }.eachCount()
        var pl = p.length

        return s.drop(pl - 1).mapIndexed { index, _ ->
        	if (s.slice(index until (index + pl)).groupingBy { it }.eachCount().all {
                ps.get(it.key) == it.value
            } ) {
                index
            } else {
                -1
            }
        }.filter { it != -1 }.toList()
    }
}
