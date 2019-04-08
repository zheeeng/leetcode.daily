/*
 * @lc app=leetcode id=101 lang=golang
 *
 * [101] Symmetric Tree
 *
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * algorithms
 * Easy (43.02%)
 * Total Accepted:    379K
 * Total Submissions: 880.1K
 * Testcase Example:  '[1,2,2,3,4,4,3]'
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 *
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠/ \ / \
 * 3  4 4  3
 *
 *
 *
 * But the following [1,2,2,null,3,null,3]  is not:
 *
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   2
 * ⁠  \   \
 * ⁠  3    3
 *
 *
 *
 *
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
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
func isSymmetric(root *TreeNode) bool {
	q := invertTree(root)
	return isSameTree(root, q)
}

func invertTree(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}
	return &TreeNode{
		Val:   root.Val,
		Left:  invertTree(root.Right),
		Right: invertTree(root.Left),
	}
}

func isSameTree(p *TreeNode, q *TreeNode) bool {
	c1 := iterTreeValue(p)
	c2 := iterTreeValue(q)

	for v1 := range c1 {
		v2 := <-c2
		if v1 == nil && v2 == nil {
			continue
		}
		if (v1 == nil && v2 != nil) || (v2 == nil && v1 != nil) || *v1 != *v2 {
			return false
		}
	}
	return true
}

func iterTreeValue(p *TreeNode) chan *int {
	c := make(chan *int)

	go func() {
		defer close(c)
		if p == nil {
			c <- nil
			return
		}
		c <- &p.Val

		if p.Left == nil {
			c <- nil
		} else {
			for v := range iterTreeValue(p.Left) {
				c <- v
			}
		}
		if p.Right == nil {
			c <- nil
		} else {
			for v := range iterTreeValue(p.Right) {
				c <- v
			}
		}
	}()

	return c
}
