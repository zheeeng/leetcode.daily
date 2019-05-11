/*
 * @lc app=leetcode id=733 lang=kotlin
 *
 * [733] Flood Fill
 */
class Solution_floodFill_0 {
    fun inBounds(grid: Array<IntArray>, r: Int, c: Int): Boolean {
        return r >= 0 && r < grid.size && c >= 0 && c < grid[0].size
    }
    fun getNeighborAxises(r: Int, c: Int): List<Pair<Int, Int>> {
        return listOf(Pair(r, c + 1), Pair(r, c - 1), Pair(r - 1, c), Pair(r + 1, c))
    }
    fun getConsecutiveNodes(grid: Array<IntArray>, r: Int, c: Int): List<Pair<Int, Int>> {
        val v = grid[r][c]
        val fst = listOf(Pair(r, c))
        
        if (grid.size == 1 && grid[0].size == 1) return fst
                
        fun genNextNodeList (seed: List<Pair<Int, Int>>): List<Pair<Int, Int>> {
            return seed.flatMap {
	            getNeighborAxises(it.first, it.second).filter {
                    inBounds(grid, it.first, it.second) && grid[it.first][it.second] == v
                }
            }
        }
        
        val snd = genNextNodeList(fst)
        
        return fst + generateSequence(Pair(fst, snd)) { (prev, curr) ->
            Pair(curr, (genNextNodeList(curr) - prev)).takeIf { it.second.size > 0 }
        }.toList().flatMap { it.second }
    }
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        getConsecutiveNodes(image, sr, sc).forEach {
            image[it.first][it.second] = newColor
        }
        return image
    }
}