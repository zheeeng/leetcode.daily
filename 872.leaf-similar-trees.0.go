/*
 * @lc app=leetcode id=872 lang=golang
 *
 * [872] Leaf-Similar Trees
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func preOrder(root *TreeNode, seq *[]int) {
    if root == nil {
        return
    }
    if root.Left == nil && root.Right == nil {
        *seq = append(*seq, root.Val)
        return
    }
    preOrder(root.Left, seq)
    preOrder(root.Right, seq)
}
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
    seq1 := []int{}
    seq2 := []int{}
    preOrder(root1, &seq1)
    preOrder(root2, &seq2)
    for i, v := range seq1 {
        if v != seq2[i] {
            return false
        }
    }
    return true
}
