/*
 * @lc app=leetcode id=993 lang=golang
 *
 * [993] Cousins in Binary Tree
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func getLevel(root *TreeNode, v int, p int) (level int, parent int) {
    if root == nil {
        return 0, p
    }
    if root.Val == v {
        return 1, p
    }
    lvl, par := getLevel(root.Left, v, root.Val)
    if lvl == 0 {
        lvl, par = getLevel(root.Right, v, root.Val)
    }
    if lvl == 0 {
        return 0, par
    }
    return lvl + 1, par
}
func isCousins(root *TreeNode, x int, y int) bool {
    lLvl, lP := getLevel(root, x, root.Val)
    rLvl, rP := getLevel(root, y, root.Val)
    return lLvl == rLvl && lP != rP
}
