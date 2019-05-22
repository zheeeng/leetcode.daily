/*
 * @lc app=leetcode id=530 lang=kotlin
 *
 * [530] Minimum Absolute Difference in BST
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
class Solution_getMinimumDifference_0 {
    fun inOrder(root: TreeNode?): List<Int> {
        if (root == null) return listOf<Int>()

        return inOrder(root.left) + listOf(root.`val`) + inOrder(root.right)
    }

    fun getMinimumDifference(root: TreeNode?): Int {
        if (root == null) return 0

        val list = inOrder(root)

        return list.zipWithNext().map { it.second - it.first }.min()!!
    }
}
