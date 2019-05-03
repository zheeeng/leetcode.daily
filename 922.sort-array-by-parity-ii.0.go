/*
 * @lc app=leetcode id=922 lang=golang
 *
 * [922] Sort Array By Parity II
 */
func sortArrayByParityII(A []int) []int {
    l := len(A)
    i, j := 0, 1
    for j < l && i < l {
        if A[i] % 2 != 0 {
            for A[j] % 2 == 1 {
                j = j + 2
            }
            A[i], A[j] = A[j], A[i]
            j = j + 2
        }
        i = i + 2
    }
    return A
}
