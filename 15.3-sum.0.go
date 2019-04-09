/*
 * @lc app=leetcode id=15 lang=golang
 *
 * [15] 3Sum
 *
 * https://leetcode.com/problems/3sum/description/
 *
 * algorithms
 * Medium (23.68%)
 * Total Accepted:    516.1K
 * Total Submissions: 2.2M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the
 * sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 *
 *
 */
import (
	"sort"
)

func threeSum(nums []int) (ret [][]int) {
	s := make(map[[3]int]struct{})

	l := len(nums)
	for i, n1 := range nums {
		m := make(map[int]bool, l-i)

		for j := i + 1; j < l; j++ {
			n2 := nums[j]
			x := -n1 - n2
			if used, ok := m[x]; ok && !used {
				ans := []int{n1, n2, x}
				sort.Ints(ans)
				ansKey := [3]int{}
				for i, a := range ans {
					ansKey[i] = a
				}

				s[ansKey] = struct{}{}
				m[n2] = true
			} else {
				m[n2] = false
			}
		}
	}

	for ansKey, _ := range s {
		ans := make([]int, 3)
		for i, k := range ansKey {
			ans[i] = k
		}
		ret = append(ret, ans)
	}

	return ret
}
