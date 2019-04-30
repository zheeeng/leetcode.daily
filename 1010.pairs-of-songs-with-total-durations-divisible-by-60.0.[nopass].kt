/*
 * @lc app=leetcode id=1010 lang=kotlin
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 */
// Time Limit Exceeded
class Solution_combinations2_0 {
    fun combinations2(nums: IntArray): List<Pair<Int, Int>> {
        return nums.withIndex().flatMap { (index, v1) ->
            nums.drop(index + 1).map { v2 -> Pair(v1, v2)}
        }
    }
    fun numPairsDivisibleBy60(time: IntArray): Int {
        return combinations2(time).map {(c1, c2) ->
            c1 + c2
        }.filter { it % 60 == 0 }.size
    }
}
