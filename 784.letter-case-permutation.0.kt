/*
 * @lc app=leetcode id=784 lang=kotlin
 *
 * [784] Letter Case Permutation
 */
class Solution_letterCasePermutation_0 {
    fun letterCasePermutation(S: String): List<String> {
        return S.fold(listOf<String>("")) { list, c ->
            when (c) {
                in 'a'..'z' -> listOf(c + ('A' - 'a'), c)
                in 'A'..'Z' -> listOf(c + ('a' - 'A'), c)
                else -> listOf(c)
            }.flatMap { char -> list.map { it + char } }
        }
    }
}
