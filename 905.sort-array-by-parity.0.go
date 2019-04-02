/*
 * @lc app=leetcode id=905 lang=golang
 *
 * [905] Sort Array By Parity
 *
 * https://leetcode.com/problems/sort-array-by-parity/description/
 *
 * algorithms
 * Easy (72.30%)
 * Total Accepted:    78.2K
 * Total Submissions: 108.2K
 * Testcase Example:  '[3,1,2,4]'
 *
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 *
 *
 * Note:
 *
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 *
 *
 *
 */
func sortArrayByParity(A []int) []int {
	l := len(A)
	for i, j := 0, l-1; i < l && j > i; i++ {
		if A[i]%2 == 1 {
			for ; A[j]%2 == 1 && j > 1; j-- {
			}

			if j > i {
				A[i], A[j] = A[j], A[i]
			} else {
				return A
			}
		}
	}
	return A
}

