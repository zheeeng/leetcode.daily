/*
 * @lc app=leetcode id=268 lang=golang
 *
 * [268] Missing Number
 */
func missingNumber(nums []int) int {
    sum := 0
    for i, n := range nums {
        sum += i - n
    }
    return sum + len(nums)
}
