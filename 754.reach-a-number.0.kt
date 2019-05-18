/*
 * @lc app=leetcode id=754 lang=kotlin
 *
 * [754] Reach a Number
 */
class Solution_reachNumber_0 {
    fun reachNumber(target: Int): Int {
        val t = target.let { if (it < 0) -it else it }
        var sum = 0
        var step = 0

        while (sum < t || (sum - t) % 2 != 0) {
            step++
            sum += step
        }

        return step
    }
}
