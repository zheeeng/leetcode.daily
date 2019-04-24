/*
 * @lc app=leetcode id=235 lang=golang
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */
/**
 * Definition for TreeNode.
 * type TreeNode struct {
 *     Val int
 *     Left *ListNode
 *     Right *ListNode
 * }
 */
func travel(root, n *TreeNode) chan *TreeNode {
    c := make(chan *TreeNode)

	go func() {
        defer close(c)
        c <- root

        if n.Val == root.Val {
            return
        }

        if n.Val > root.Val {
            for n := range travel(root.Right, n) {
                c <- n
            }
        } else {
            for n := range travel(root.Left, n) {
                c <- n
            }
        }
	} ()

	return c
}
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
	c1 := travel(root, p)
	c2 := travel(root, q)

    var last *TreeNode
	for n1 := range c1 {
		n2 := <- c2
		if n1 != n2 || n1 == nil || n2 == nil {
			return last
        }
        last = n2
	}
	return last
}
