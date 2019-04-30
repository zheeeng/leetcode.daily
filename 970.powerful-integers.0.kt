/*
 * @lc app=leetcode id=970 lang=kotlin
 *
 * [970] Powerful Integers
 */
class Solution_powerfulIntegers_0 {
    fun powerfulIntegers(x: Int, y: Int, bound: Int): List<Int> {
        val listX = generateSequence(1) {
            (it * x).takeIf { it <= bound && it != 1 }
        }.toList()
        val listY = generateSequence(1) {
            (it * y).takeIf { it <= bound && it != 1 }
        }.toList()

        return listX.flatMap { vx -> listY.map { vy -> vx + vy }.filter { it <= bound } }.distinct().sorted()
    }
}
