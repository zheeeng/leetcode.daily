/*
 * @lc app=leetcode id=1010 lang=kotlin
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 */
class Solution_numPairsDivisibleBy60_0 {
    fun combin2s (n: Int): Int {
        return n * (n - 1) / 2
    }
    fun numPairsDivisibleBy60(time: IntArray): Int {
        return IntArray(61) { _ -> 0 }
            .also { arr ->
                time.map { t -> t % 60 }.forEach { v -> arr[v]++ }
            }
            .let { arr -> arr.take(30).foldIndexed(combin2s(arr[0]) + combin2s(arr[30])) { i, acc, v ->
                acc + v * arr[60 - i]
            }}
    }
}
