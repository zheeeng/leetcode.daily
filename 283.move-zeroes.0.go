/*
 * @lc app=leetcode id=283 lang=golang
 *
 * [283] Move Zeroes
 */
func moveZeroes(nums []int)  {
    l := len(nums)
    for i := 0; i < l; i++ {
        for j := i + 1; j < l; j++ {
            if nums[i] == 0 {
                nums[i], nums[j] = nums[j], nums[i]
                if nums[i] != 0 {
                    break
                }
            }
        }
    }
}
