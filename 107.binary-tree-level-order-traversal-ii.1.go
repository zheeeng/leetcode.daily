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
func bfs(ret *[][]int, level int, node *TreeNode) {
	if node == nil {
		return
	}
	l := len(*ret)
	if l <= level {
		*ret = append([][]int{[]int{node.Val}}, *ret...)
	} else {
		(*ret)[l-level-1] = append([]int{node.Val}, (*ret)[l-level-1]...)
	}
	if node.Left == nil && node.Right == nil {
		return
	}
	bfs(ret, level+1, node.Right)
	bfs(ret, level+1, node.Left)
}

func levelOrderBottom(root *TreeNode) (ret [][]int) {
	bfs(&ret, 0, root)
	return
}
