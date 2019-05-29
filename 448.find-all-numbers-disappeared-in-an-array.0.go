/*
 * @lc app=leetcode id=448 lang=golang
 *
 * [448] Find All Numbers Disappeared in an Array
 */
import (
    "fmt"
)
func findDisappearedNumbers(nums []int) []int {
    for _, v := range nums {
        p := 0
        if v > 0 {
            p = v - 1
        } else {
            p = -v - 1
        }

        t := nums[p]

        if t > 0 {
            nums[p] = -t
        }
    }
    ret := []int{}
    for i, v := range nums {
        if v > 0 {
            ret = append(ret, i + 1)
        }
    }
    return ret
}
