/*
 * @lc app=leetcode id=819 lang=kotlin
 *
 * [819] Most Common Word
 */
class Solution_mostCommonWord_0 {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        return paragraph.split("[^\\w]+".toRegex())
            .map { it.toLowerCase() }
            .filter { !banned.contains(it) }
            .groupBy { it }
            .toList()
            .reduce { prev, curr ->
            	if (curr.second.size > prev.second.size ) curr else prev
            }.first
    }
}
