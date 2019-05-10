/*
 * @lc app=leetcode id=812 lang=golang
 *
 * [812] Largest Triangle Area
 */
func largestTriangleArea(points [][]int) float64 {
    l := len(points)
    max := 0
    for i := 0; i < l; i++ {
        for j := i + 1; j < l; j++ {
            for k := j + 1; k < l; k++ {
                area := points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])
                if area < 0 {
                    area = -area
                }
                if area > max {
                    max = area
                }
            }
        }
    }
    return float64(max) / 2
}
