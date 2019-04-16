/*
 * @lc app=leetcode id=107 lang=golang
 *
 * [107] Binary Tree Level Order Traversal II
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * algorithms
 * Easy (46.07%)
 * Total Accepted:    217.7K
 * Total Submissions: 471.2K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, return the bottom-up level order traversal of its
 * nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 *
 *
 * return its bottom-up level order traversal as:
 *
 * [
 * ⁠ [15,7],
 * ⁠ [9,20],
 * ⁠ [3]
 * ]
 *
 *
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func levelOrderBottom(root *TreeNode) (ret [][]int) {
	var top *TreeNode
	queue := []*TreeNode{root}
	if root == nil {
		return
	}

	for len(queue) > 0 {
		level := len(queue)
		subList := []int{}

		for i := 0; i < level; i++ {
			top, queue = queue[len(queue)-1], queue[:len(queue)-1]
			if top.Left != nil {
				queue = append([]*TreeNode{top.Left}, queue...)
			}
			if top.Right != nil {
				queue = append([]*TreeNode{top.Right}, queue...)
			}
			subList = append(subList, top.Val)
		}

		ret = append([][]int{subList}, ret...)
	}

	return
}
