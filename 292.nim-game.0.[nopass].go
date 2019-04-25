/*
 * @lc app=leetcode id=292 lang=golang
 *
 * [292] Nim Game
 */
func canWinNim(n int) bool {
    if n < 4 {
        return true
    }
    if n == 4 {
        return false
    }
    return !canWinNim(n - 3) || !canWinNim(n - 2) || !canWinNim(n - 1)
}
