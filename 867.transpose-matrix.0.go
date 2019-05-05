/*
 * @lc app=leetcode id=867 lang=golang
 *
 * [867] Transpose Matrix
 */
func transpose(A [][]int) [][]int {
    r := len(A)
    c := len(A[0])
    ret := make([][]int, c)
    for i := 0; i < c; i++ {
        ret[i] = make([]int, r)
    }

    for i := 0; i < r; i++ {
        for j := 0; j < c; j++ {
            ret[j][i] = A[i][j]
        }
    }
    return ret
}
