/*
 * @lc app=leetcode id=669 lang=kotlin
 *
 * [669] Trim a Binary Search Tree
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
class Solution_trimBST_0 {
    fun trimBST(root: TreeNode?, L: Int, R: Int): TreeNode? {
        if (root == null) return null

        return when {
            root.`val` < L -> trimBST(root.right, L, R)
            root.`val` > R -> trimBST(root.left, L, R)
            else -> TreeNode(root.`val`).apply {
                left = trimBST(root.left, L, R)
                right = trimBST(root.right, L, R)
            }
        }
    }
}
