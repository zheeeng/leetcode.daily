/*
 * @lc app=leetcode id=1022 lang=kotlin
 *
 * [1022] Sum of Root To Leaf Binary Numbers
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
class Solution_sumRootToLeaf_0 {
    fun sumRootToLeaf(root: TreeNode?, base: Int = 0): Int {
        root ?: return 0

        val newBase = 2 * base + root.`val`

        root.left ?: root.right ?: return newBase

        root.left ?: return sumRootToLeaf(root.right, newBase)

        root.right ?: sumRootToLeaf(root.left, newBase)

        return sumRootToLeaf(root.right, newBase) + sumRootToLeaf(root.left, newBase)
    }
}
