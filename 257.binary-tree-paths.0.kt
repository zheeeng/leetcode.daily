/*
 * @lc app=leetcode id=257 lang=kotlin
 *
 * [257] Binary Tree Paths
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
class Solution_binaryTreePaths_0 {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        root ?: return listOf<String>()

        return (binaryTreePaths(root.left) + binaryTreePaths(root.right))
            .filterNotNull()
            .let {
                if (it.size == 0) listOf("${root.`val`}") else {
                    it.map { "${root.`val`}->$it" }
                }
            }
    }
}