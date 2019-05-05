/*
 * @lc app=leetcode id=883 lang=golang
 *
 * [883] Projection Area of 3D Shapes
 */
func projectionArea(grid [][]int) (area int) {
    N := len(grid)
    for i := 0; i < N; i++ {
        for j := 0; j < N; j++ {
            if grid[i][j] != 0 {
                area++
            }
        }
    }

    for i := 0; i < N; i++ {
        max1 := 0
        max2 := 0
        for j := 0; j < N; j++ {
            n1 := grid[i][j]
            n2 := grid[j][i]

            if n1 > max1 {
                max1 = n1
            }
            if n2 > max2 {
                max2 = n2
            }
        }
        area += max1 + max2
    }

    return
}
