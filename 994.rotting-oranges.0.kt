/*
 * @lc app=leetcode id=994 lang=kotlin
 *
 * [994] Rotting Oranges
 */
class Solution_orangesRotting_0 {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val r = grid.size

        if (r == 0) return 0

        val c = grid[0].size

        if (c == 0) return 0

        val coord = (0 until r).flatMap { i ->
            (0 until c).map { j -> i to j }
        }

        var step = -1
        var stopped = false
        var rottenNum = 2

        while (!stopped) {
            stopped = true
            coord.forEach forEach@{ (i, j) ->
                if (grid[i][j] != rottenNum) return@forEach

                val up = grid.getOrNull(i - 1)?.getOrNull(j)?: 0
                val left = grid.getOrNull(i)?.getOrNull(j - 1)?: 0
                val right = grid.getOrNull(i)?.getOrNull(j + 1)?: 0
                val down = grid.getOrNull(i + 1)?.getOrNull(j)?: 0

                if (up == 1) {
                    grid[i-1][j] = rottenNum + 1
                    stopped = false
                }
                if (left == 1) {
                    grid[i][j-1] = rottenNum + 1
                    stopped = false
                }
                if (right == 1) {
                    grid[i][j+1] = rottenNum + 1
                    stopped = false
                }
                if (down == 1) {
                    grid[i+1][j] = rottenNum + 1
                    stopped = false
                }
            }
            rottenNum++
        }

        coord.forEach { (i, j) ->
            if (grid[i][j] == 1) return -1
        }

        return rottenNum - 3
    }
}
