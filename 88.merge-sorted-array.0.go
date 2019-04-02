/*
 * @lc app=leetcode id=88 lang=golang
 *
 * [88] Merge Sorted Array
 *
 * https://leetcode.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (35.19%)
 * Total Accepted:    343.5K
 * Total Submissions: 976.3K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * Note:
 * 
 * 
 * The number of elements initialized in nums1 and nums2 are m and n
 * respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to
 * m + n) to hold additional elements from nums2.
 * 
 * 
 * Example:
 * 
 * 
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * Output: [1,2,2,3,5,6]
 * 
 * 
 */
func merge(nums1 []int, m int, nums2 []int, n int) {
	c := m + n - 1
	c1 := m - 1
	c2 := n - 1
	for c2 >= 0 {
		if c1 < 0 {
			for ; c2 >= 0; c2-- {
				nums1[c] = nums2[c2]
				c--
			}
			return
		}
		for ; nums2[c2] >= nums1[c1]; c2-- {
			nums1[c] = nums2[c2]
			c--

			if c2 == 0 {
				return
			}
		}
		for ; nums2[c2] <= nums1[c1]; c1-- {
			nums1[c] = nums1[c1]
			c--

			if c1 == 0 {
				c1--
				break
			}
		}
	}
}
