/*
 * @lc app=leetcode id=892 lang=golang
 *
 * [892] Surface Area of 3D Shapes
 */
func compact0(n int) int {
    if n < 0 {
        return 0
    }
    return n
}
func surfaceArea(grid [][]int) int {
    N := len(grid)
    topArea := 0
    for i := 0; i < N; i++ {
        for j := 0; j < N; j++ {
            if grid[i][j] != 0 {
                topArea++
            }
        }
    }

    edgeArea := 0
    for i := 0; i < N; i++ {
        last1 := 0
        last2 := 0
        for j := 0; j < N; j++ {
            n1 := grid[i][j]
            n2 := grid[j][i]

            edgeArea += (compact0(n1 - last1) + compact0(n2 - last2)) * 2
            last1 = n1
            last2 = n2
        }
    }

    return topArea * 2 + edgeArea
}
