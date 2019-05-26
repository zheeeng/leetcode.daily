/*
 * @lc app=leetcode id=383 lang=kotlin
 *
 * [383] Ransom Note
 */
class Solution_canConstruct_0 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val rMap = ransomNote.groupingBy { it }.eachCount()
        val mMap = magazine.groupingBy { it }.eachCount()

        return rMap.all { it.value <= mMap.getOrDefault(it.key, 0) }
    }
}
