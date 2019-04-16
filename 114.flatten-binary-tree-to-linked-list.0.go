/*
 * @lc app=leetcode id=114 lang=golang
 *
 * [114] Flatten Binary Tree to Linked List
 *
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
 *
 * algorithms
 * Medium (41.60%)
 * Total Accepted:    229.5K
 * Total Submissions: 549K
 * Testcase Example:  '[1,2,5,3,4,null,6]'
 *
 * Given a binary tree, flatten it to a linked list in-place.
 *
 * For example, given the following tree:
 *
 *
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   5
 * ⁠/ \   \
 * 3   4   6
 *
 *
 * The flattened tree should look like:
 *
 *
 * 1
 * ⁠\
 * ⁠ 2
 * ⁠  \
 * ⁠   3
 * ⁠    \
 * ⁠     4
 * ⁠      \
 * ⁠       5
 * ⁠        \
 * ⁠         6
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
func _flatten(root *TreeNode, prev **TreeNode) {

	if root == nil {

		return

	}

	_flatten(root.Right, prev)

	_flatten(root.Left, prev)

	root.Right = *prev

	root.Left = nil

	*prev = root

}

func flatten(root *TreeNode) {

	var prev *TreeNode = nil

	_flatten(root, &prev)

}
