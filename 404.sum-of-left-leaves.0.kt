/*
 * @lc app=leetcode id=404 lang=kotlin
 *
 * [404] Sum of Left Leaves
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
class Solution_sumOfLeftLeaves_0 {
    fun isLeaf(root: TreeNode?): Boolean {
        if (root == null) return false

        if (root.left == null && root.right == null) return true

        return false
    }

    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0

        if (isLeaf(root.left)) {
            if (isLeaf(root.right)) {
                return root.left!!.`val`
            }

            return root.left!!.`val` + sumOfLeftLeaves(root.right)
        }

        if (isLeaf(root.right)) {
            return sumOfLeftLeaves(root.left)
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right)
    }
}
