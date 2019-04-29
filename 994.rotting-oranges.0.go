/*
 * @lc app=leetcode id=994 lang=golang
 *
 * [994] Rotting Oranges
 */
func orangesRotting(grid [][]int) int {
    lenI := len(grid)
    if lenI == 0 {
        return 0
    }

    lenJ := len(grid[0])
    if lenJ == 0 {
        return 0
    }

    step := -1
    stopped := false
    rottenNum := 2

    for !stopped {
        step++
        stopped = true
        for i := 0; i < lenI; i++ {
            for j := 0; j < lenJ; j++ {
                if grid[i][j] == rottenNum {
                    if i > 0 && grid[i - 1][j] == 1 {
                        stopped = false
                        grid[i - 1][j] = rottenNum + 1
                    }
                    if i < lenI - 1 && grid[i + 1][j] == 1 {
                        stopped = false
                        grid[i + 1][j] = rottenNum + 1
                    }
                    if j > 0 && grid[i][j - 1] == 1 {
                        stopped = false
                        grid[i][j - 1] = rottenNum + 1
                    }
                    if j < lenJ - 1 && grid[i][j + 1] == 1 {
                        stopped = false
                        grid[i][j + 1] = rottenNum + 1
                    }
                }
            }
        }
        rottenNum++
    }

    for i := 0; i < lenI; i++ {
        for j := 0; j < lenJ; j++ {
            if grid[i][j] == 1 {
                return -1
            }
        }
    }

    return step
}
