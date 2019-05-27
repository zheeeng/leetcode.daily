/*
 * @lc app=leetcode id=409 lang=kotlin
 *
 * [409] Longest Palindrome
 */
class Solution_longestPalindrome_0 {
    fun longestPalindrome(s: String): Int {
    	return s.groupingBy { it }.eachCount()
            .toList()
            .partition { it.second % 2 == 0 }
            .let {
                it.first.map { it.second }.sum() +
                    it.second.map { it.second }.sum() -
                    it.second.size +
                    if (it.second.size == 0) 0 else 1
            }
    }
}
