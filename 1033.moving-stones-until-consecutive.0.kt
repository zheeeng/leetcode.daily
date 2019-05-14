/*
 * @lc app=leetcode id=1033 lang=kotlin
 *
 * [1033] Moving Stones Until Consecutive
 */
class Solution_numMovesStones_0 {
    fun numMovesStones(a: Int, b: Int, c: Int): IntArray {
        val arr = listOf(a, b, c).sorted()
        var min = 0
        var max = 0
        if (arr[2] - arr[1] > 1) {
            min++
            max += arr[2] - arr[1] - 1
        }
        if (arr[1] - arr[0] > 1) {
            min++
            max += arr[1] - arr[0] - 1
        }
       if (arr[2] - arr[1] == 2 || arr[1] - arr[0] == 2) {
            min = 1
        }

        return intArrayOf(min, max)
    }
}
