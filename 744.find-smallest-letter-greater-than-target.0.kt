/*
 * @lc app=leetcode id=744 lang=kotlin
 *
 * [744] Find Smallest Letter Greater Than Target
 */
class Solution_nextGreatestLetter_0 {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        return letters.sorted().let { it.filter { it > target }.firstOrNull()?: it.first() }
    }
}
