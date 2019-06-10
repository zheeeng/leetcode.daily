/*
 * @lc app=leetcode id=398 lang=golang
 *
 * [398] Random Pick Index
 */
import "math/rand"

type Solution struct {
    nums []int
}

func Constructor(nums []int) Solution {
    return Solution{
        nums: nums,
    }
}

func (this *Solution) Pick(target int) int {
    res, nums, index := -1, this.nums, 0
    for i, n := range nums {
        if n == target {
            index++
            if rand.Intn(index) == 0 {
                res = i
            }
        }
    }
    return res
}
/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.Pick(target);
 */
