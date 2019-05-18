/*
 * @lc app=leetcode id=606 lang=kotlin
 *
 * [606] Construct String from Binary Tree
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
class Solution_tree2str_0 {
    fun tree2str(t: TreeNode?): String {
        return when {
            t == null -> ""
            t.left == null && t.right == null -> "${t.`val`}"
            t.left == null -> "${t.`val`}()(${tree2str(t.right)})"
            t.right == null -> "${t.`val`}(${tree2str(t.left)})"
            else -> "${t.`val`}(${tree2str(t.left)})(${tree2str(t.right)})"
        }
    }
}
