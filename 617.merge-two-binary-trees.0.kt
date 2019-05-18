/*
 * @lc app=leetcode id=617 lang=kotlin
 *
 * [617] Merge Two Binary Trees
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
class Solution_mergeTrees_0 {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        return when {
            t1 == null -> t2
            t2 == null -> t1
            else -> TreeNode(t1.`val` + t2.`val`).apply {
                left = mergeTrees(t1.left, t2.left)
                right = mergeTrees(t1.right, t2.right)
            }
        }
    }
}
