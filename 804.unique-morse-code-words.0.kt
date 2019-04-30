/*
 * @lc app=leetcode id=804 lang=kotlin
 *
 * [804] Unique Morse Code Words
 */
class Solution_uniqueMorseRepresentations_0 {
    val codeTable = listOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        return words.map { it.map { codeTable[it - 'a'] }.joinToString("") }.distinct().count()
    }
}
