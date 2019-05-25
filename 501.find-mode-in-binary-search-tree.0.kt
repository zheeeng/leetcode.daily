/*
 * @lc app=leetcode id=501 lang=kotlin
 *
 * [501] Find Mode in Binary Search Tree
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
class Solution_findMode_0 {
    fun inOrder(root: TreeNode?): List<Int> {
        if (root == null) return listOf<Int>()
        return inOrder(root.left) + listOf(root.`val`) + inOrder(root.right)
    }
    fun findMode(root: TreeNode?): IntArray {
        val vs = inOrder(root)

        if (vs.size == 0) {
            return intArrayOf()
        }

        var currVal = vs.first()
        var currCount = 1
        var maxVals = listOf<Int>(currVal)
        var maxCount = 1

		vs.drop(1).forEach {
            if (it == currVal) {
                currCount++
            } else {
                currVal = it
                currCount = 1
            }
            if (currCount == maxCount) {
                maxVals = maxVals + listOf(currVal)
            }
            if (currCount > maxCount) {
                maxCount = currCount
                maxVals = listOf(currVal)
            }
        }

        return maxVals.toIntArray()
    }
}
