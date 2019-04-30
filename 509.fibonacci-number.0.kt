/*
 * @lc app=leetcode id=509 lang=kotlin
 *
 * [509] Fibonacci Number
 */
class Solution_fib_0 {
    fun fib(N: Int): Int {
        return generateSequence(Pair(0, 1)) {
            Pair(it.second, it.first + it.second)
        }.map { it.first }.take(N + 1).last()
    }
}
