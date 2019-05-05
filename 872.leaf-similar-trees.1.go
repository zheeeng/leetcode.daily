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
func iterTreeValue(root *TreeNode) chan int {
    c := make(chan int)
    go func () {
        defer close(c)

        if root == nil {
            return
        }

        if root.Left == nil && root.Right == nil {
            c <- root.Val
        } else {
            for v := range iterTreeValue(root.Left) {
                c <- v
            }
            for v := range iterTreeValue(root.Right) {
                c <- v
            }
        }
    } ()
    return c
}
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
    c1 := iterTreeValue(root1)
    c2 := iterTreeValue(root2)

	for v1 := range c1 {
		v2 := <- c2
		if v1 != v2 {
			return false
		}
	}
	return true
}

