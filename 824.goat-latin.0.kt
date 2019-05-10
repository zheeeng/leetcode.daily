/*
 * @lc app=leetcode id=824 lang=kotlin
 *
 * [824] Goat Latin
 */
class Solution_toGoatLatin_0 {
    fun startsWithVowel (S: String): Boolean {
        return when (S[0]) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'  -> true
        	else -> false
        }
    }
    fun toGoatLatin(S: String): String {
        return S.split(" ").map {
			if (startsWithVowel(it)) it else (it.drop(1) + it.first())
        }.mapIndexed { index, str ->
            str + "ma" + (0..index).map { "a" }.joinToString("")
        }.joinToString(" ")
    }
}
