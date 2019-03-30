/*
 * @lc app=leetcode id=965 lang=golang
 *
 * [965] Univalued Binary Tree
 *
 * https://leetcode.com/problems/univalued-binary-tree/description/
 *
 * algorithms
 * Easy (67.33%)
 * Total Accepted:    24.4K
 * Total Submissions: 36.2K
 * Testcase Example:  '[1,1,1,1,1,null,1]'
 *
 * A binary tree is univalued if every node in the tree has the same value.
 *
 * Return true if and only if the given tree is univalued.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: [1,1,1,1,1,null,1]
 * Output: true
 *
 *
 *
 * Example 2:
 *
 *
 * Input: [2,2,2,5,2]
 * Output: false
 *
 *
 *
 *
 *
 * Note:
 *
 *
 * The number of nodes in the given tree will be in the range [1, 100].
 * Each node's value will be an integer in the range [0, 99].
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
func isUnivalTree(root *TreeNode) bool {
	if root == nil {
		return true
	}

	val := root.Val
	lists := []*TreeNode{root}
	lastNode := root

	for len(lists) > 0 {
		for lastNode.Left != nil {
			if lastNode.Left.Val != val {
				return false
			}

			lastNode = lastNode.Left
			lists = append(lists, lastNode)
		}

		lastNode, lists = lists[len(lists)-1], lists[:len(lists)-1]

		if lastNode.Right != nil {
			if lastNode.Right.Val != val {
				return false
			}

			lastNode = lastNode.Right
			lists = append(lists, lastNode)
		}
	}

	return true
}

