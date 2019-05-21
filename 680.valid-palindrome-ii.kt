/*
 * @lc app=leetcode id=680 lang=kotlin
 *
 * [680] Valid Palindrome II
 */
class Solution_validPalindrome_0 {
    fun validPalindrome(s: String): Boolean {
        s.zip(s.reversed()).withIndex().filter { it.value.first != it.value.second }
            .map { it.index }
            .let {
                if (it.size == 0) return true

                val subS = s.substring(it.first(), s.length - 1 - it.first()).also(::println)
                val subS2 = s.substring(it.first() + 1, s.length - it.first()).also(::println)

                return subS == subS.reversed() || subS2 == subS2.reversed()
            }
    }
}
