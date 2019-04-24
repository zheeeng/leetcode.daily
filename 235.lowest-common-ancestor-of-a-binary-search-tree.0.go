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
import (
    "fmt"
)
func travel (root, n *TreeNode) (path []*TreeNode) {
    if root == nil {
        return
    }

    path = append(path, root)

    if n.Val == root.Val {
        return
    }

    for n.Val != root.Val {
        if n.Val > root.Val {
            root = root.Right
        } else {
            root = root.Left
        }
        path = append(path, root)
    }

    path = append(path, root)

    return
}
func lowestCommonAncestor(root, p, q *TreeNode) *TreeNode {
    pathP := travel(root, p)
    pathQ := travel(root, q)
    lenP := len(pathP)
    lenQ := len(pathQ)
    l := lenP
    if lenQ < l {
        l = lenQ
    }

    i := 0
    for i < l && pathP[i] == pathQ[i] {
        i++
    }

    return pathP[i - 1]
}
