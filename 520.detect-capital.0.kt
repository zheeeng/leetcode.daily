/*
 * @lc app=leetcode id=520 lang=kotlin
 *
 * [520] Detect Capital
 */
class Solution_detectCapitalUse_0 {
    fun detectCapitalUse(word: String): Boolean {
        return word == word.toLowerCase() || word == word.toUpperCase() || (word.first().toUpperCase() == word.first() && word.drop(1).toLowerCase() == word.drop(1))
    }
}
