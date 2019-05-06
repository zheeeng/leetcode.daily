/*
 * @lc app=leetcode id=840 lang=golang
 *
 * [840] Magic Squares In Grid
 */
func isMagicSquares(grid [][]int, x, y int) bool {
    if grid[x][y] != 5 {
        return false
    }

    a, b, c := grid[x - 1][y - 1], grid[x][y - 1], grid[x + 1][y - 1]
    e, f, g := grid[x - 1][y],     grid[x][y]    , grid[x + 1][y]
    h, i, j := grid[x - 1][y + 1], grid[x][y + 1], grid[x + 1][y + 1]

    max := a
    min := a
    sum := 0
    set := map[int]struct{}{}
    nums := []int{a,b,c,e,f,g,h,i,j}
    for _, n := range nums {
        set[n] = struct{}{}
        sum += n
        if n > max {
            max = n
        }
        if n < min {
            min = n
        }
    }
    if len(set) != 9 || sum != 45 || min != 1 || max != 9 {
        return false
    }

    return (a + j == 10) && (e + g == 10) && (h + c == 10) && (b + i == 10) && (a + e + h == 15) && (a + b + c == 15)
}
func numMagicSquaresInside(grid [][]int) int {
    rows := len(grid)
    cols := len(grid[0])
    count := 0
    for i := 1; i < rows - 1; i++ {
        for j := 1; j < cols - 1; j++ {
            if isMagicSquares(grid, i, j) {
                count++
            }
        }
    }
    return count
}
