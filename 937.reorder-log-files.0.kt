/*
 * @lc app=leetcode id=937 lang=kotlin
 *
 * [937] Reorder Log Files
 */
class Solution_reorderLogFiles_0 {
    fun reorderLogFiles(logs: Array<String>): Array<String> {
        val parsed = logs.map { it.split(" ") }
        val (digitLogs, letterLogs) = parsed.partition { it[1][0].toChar().isDigit() }
        return (letterLogs.sortedBy { it.drop(1).joinToString(" ") + it[0] }.map { it.joinToString(" ")} + digitLogs.map { it.joinToString(" ")}).toTypedArray<String>()
    }
}
