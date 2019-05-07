/*
 * @lc app=leetcode id=783 lang=golang
 *
 * [783] Minimum Distance Between BST Nodes
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
import (
    "sort"
)
func minDiffInBST(root *TreeNode) int {
    vals := []int{}
    nodeList := []*TreeNode{root}
    lastNode := root

    for len(nodeList) > 0 {
        for lastNode.Left != nil {
            lastNode = lastNode.Left
            nodeList = append(nodeList, lastNode)
        }

        for len(nodeList) > 0 {
            lastNode, nodeList = nodeList[len(nodeList)-1], nodeList[:len(nodeList)-1]
            vals = append(vals, lastNode.Val)

            if lastNode.Right != nil {
                lastNode = lastNode.Right
                nodeList = append(nodeList, lastNode)
                break
            }
        }
    }

    sort.Ints(vals)

    min := vals[1] - vals[0]
    for i := 2; i < len(vals); i++ {
        diff := vals[i] - vals[i - 1]
        if diff < min {
            min = diff
        }
    }
    return min
}
