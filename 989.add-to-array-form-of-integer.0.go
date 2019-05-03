/*
 * @lc app=leetcode id=989 lang=golang
 *
 * [989] Add to Array-Form of Integer
 */
func addToArrayForm(A []int, K int) []int {
    carray := 0
    for i := len(A) - 1; i >= 0; i-- {
        r := K % 10
        K = K / 10
        s := A[i] + r + carray
        if s >= 10 {
            s -= 10
            carray = 1
        } else {
            carray = 0
        }
        A[i] = s
        if K == 0 && carray == 0 {
            break
        }
    }
    initial := []int{}
    for K != 0 || carray != 0{
        r := K % 10
        K = K / 10
        s := r + carray
        if s >= 10 {
            s -= 10
            carray = 1
        } else {
            carray = 0
        }
        initial = append([]int{s}, initial...)
    }
    if carray == 1 {
        initial = append([]int{1}, initial...)
    }
    A = append(initial, A...)
    return A
}
