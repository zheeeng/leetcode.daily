/*
 * @lc app=leetcode id=682 lang=kotlin
 *
 * [682] Baseball Game
 */
class Solution_calPoints_0 {
    fun calPoints(ops: Array<String>): Int {
        return ops.fold(listOf<Int>()) { records, op ->
                when (op) {
                    "+" -> records + records.takeLast(2).sum()
                    "D" -> records + records.last() * 2
                    "C" -> records.dropLast(1)
                    else -> records + op.toInt()
                }
        }.sum()
    }
}
