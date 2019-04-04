/*
 * @lc app=leetcode id=100 lang=golang
 *
 * [100] Same Tree
 *
 * https://leetcode.com/problems/same-tree/description/
 *
 * algorithms
 * Easy (49.66%)
 * Total Accepted:    360.6K
 * Total Submissions: 726.1K
 * Testcase Example:  '[1,2,3]\n[1,2,3]'
 *
 * Given two binary trees, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 * 
 * Example 1:
 * 
 * 
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   3     2   3
 * 
 * ⁠       [1,2,3],   [1,2,3]
 * 
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:     1         1
 * ⁠         /           \
 * ⁠        2             2
 * 
 * ⁠       [1,2],     [1,null,2]
 * 
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * 
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   1     1   2
 * 
 * ⁠       [1,2,1],   [1,1,2]
 * 
 * Output: false
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
func isSameTree(p *TreeNode, q *TreeNode) bool {
	c1 := iterTreeValue(p)
	c2 := iterTreeValue(q)

	for v1 := range c1 {
		v2 := <- c2
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
	} ()

	return c
}

