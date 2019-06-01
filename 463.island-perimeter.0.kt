/*
 * @lc app=leetcode id=463 lang=kotlin
 *
 * [463] Island Perimeter
 */
class Solution_islandPerimeter_0 {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows = grid.size
        if (rows == 0) return 0
        val cols = grid[0].size

        return (0 until rows).fold(0) { total0, row ->
            (0 until cols).fold(total0) { total, col ->
            	if (grid[row][col] == 0) {
                    total
                } else {
                    total + 4 -
                        (if (grid.getOrNull(row - 1)?.getOrNull(col)?:0 == 1) 1 else 0) -
	                    (if (grid.getOrNull(row + 1)?.getOrNull(col)?:0 == 1) 1 else 0) -
                        (if (grid.getOrNull(row)?.getOrNull(col - 1)?:0 == 1) 1 else 0) -
	                    (if (grid.getOrNull(row)?.getOrNull(col + 1)?:0 == 1) 1 else 0)

                }
            }
        }
    }
}
