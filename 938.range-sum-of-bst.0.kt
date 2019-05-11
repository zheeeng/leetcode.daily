/*
 * @lc app=leetcode id=938 lang=kotlin
 *
 * [938] Range Sum of BST
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
class Solution_rangeSumBST_0 {
    fun rangeSumBST(root: TreeNode?, L: Int, R: Int): Int {
        if (root == null) return 0

        return (root.`val`.takeIf {
            it >= L && it <= R
        }?: 0) + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R)
    }
}
