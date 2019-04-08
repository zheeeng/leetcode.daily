/*
 * @lc app=leetcode id=112 lang=kotlin
 *
 * [112] Path Sum
 *
 * https://leetcode.com/problems/path-sum/description/
 *
 * algorithms
 * Easy (37.32%)
 * Total Accepted:    298.5K
 * Total Submissions: 798.9K
 * Testcase Example:  '[5,4,8,11,null,13,4,7,2,null,null,null,1]\n22'
 *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *
 * ⁠     5
 * ⁠    / \
 * ⁠   4   8
 * ⁠  /   / \
 * ⁠ 11  13  4
 * ⁠/  \      \
 * 7    2      1
 *
 *
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
class Solution_hasPathSum_0 {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean =
        getPaths(root).map { it.reduce { a, c -> a + c } }.any { it == sum }

    fun getPaths(node: TreeNode?): List<List<Int>> = when {
            node == null -> listOf<List<Int>>()
            node.left == null && node.right == null -> listOf(listOf(node.`val`))
            else -> (listOf(node.left, node.right)
                .flatMap { getPaths(it) }
                .map { listOf(node.`val`) + it })
        }

}
