/*
 * @lc app=leetcode id=897 lang=golang
 *
 * [897] Increasing Order Search Tree
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func travel(root *TreeNode) (*TreeNode, *TreeNode) {
    if root == nil {
        return nil, nil
    }

    if root.Left == nil && root.Right == nil {
        return root, root
    }

    if root.Left == nil {
        leftMost, rightMost := travel(root.Right)
        root.Right = leftMost
        return root, rightMost
    }

    if root.Right == nil {
        leftMost, rightMost := travel(root.Left)
        rightMost.Right = root
        root.Left = nil
        return leftMost, root
    }

    leftMost1, rightMost1 := travel(root.Left)
    leftMost2, rightMost2 := travel(root.Right)
    rightMost1.Right = root
    root.Left = nil
    root.Right = leftMost2

    return leftMost1, rightMost2
}

func increasingBST(root *TreeNode) *TreeNode {
    leftMost, _ := travel(root)

    return leftMost
}
