/*
 * @lc app=leetcode id=637 lang=kotlin
 *
 * [637] Average of Levels in Binary Tree
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
class Solution_averageOfLevels_0 {
    fun branchesOfTree (root: TreeNode?): List<List<TreeNode>> {
        return generateSequence(listOf(root!!)) {
            it.flatMap {
                listOf(it.left, it.right).filterNotNull()
            }.takeIf { it.size > 0 }
        }.toList()
    }

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        return branchesOfTree(root).map { it.map { it.`val` }.average() }.toDoubleArray()
    }
}

