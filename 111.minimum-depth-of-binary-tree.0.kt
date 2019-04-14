/*
 * @lc app=leetcode id=111 lang=kotlin
 *
 * [111] Minimum Depth of Binary Tree
 *
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (35.03%)
 * Total Accepted:    284.8K
 * Total Submissions: 811.8K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 * return its minimum depth = 2.
 *
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
class Solution_minDepth_0 {
    fun minDepth(root: TreeNode?): Int = when {
        root == null -> 0
        root.left == null && root.right == null -> 1
        root.left == null -> 1 + minDepth(root.right)
        root.right == null -> 1 + minDepth(root.left)
        else -> 1 + minOf(minDepth(root.left), minDepth(root.right))
    }
}
