/*
 * @lc app=leetcode id=700 lang=kotlin
 *
 * [700] Search in a Binary Search Tree
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution_searchBST_0 {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null

        if (`val` == root.`val`) return root

        if (`val` < root.`val`) return searchBST(root.left, `val`)

        return searchBST(root.right, `val`)
    }
}
