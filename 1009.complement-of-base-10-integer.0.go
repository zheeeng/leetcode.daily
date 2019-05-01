/*
 * @lc app=leetcode id=1009 lang=golang
 *
 * [1009] Complement of Base 10 Integer
 */
func bitwiseComplement(N int) int {
    if N == 0 {
        return 1
    }
    i := 1
    for i < N {
        i = i << 1
    }

    return ^N & (i- 1)
}
