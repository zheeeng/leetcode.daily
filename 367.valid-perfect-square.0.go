/*
 * @lc app=leetcode id=367 lang=golang
 *
 * [367] Valid Perfect Square
 */
func isPerfectSquare(num int) bool {
    i := 0
    for ; i * i < num; i++ {}
    return i * i == num
}
