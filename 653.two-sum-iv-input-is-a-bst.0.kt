/*
 * @lc app=leetcode id=653 lang=kotlin
 *
 * [653] Two Sum IV - Input is a BST
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
class Solution_findTarget_0 {
    fun findTarget(root: TreeNode?, k: Int, s: MutableSet<Int> = mutableSetOf<Int>()): Boolean {
        if (root == null) return false

        if (s.contains(k - root.`val`)) return true

        s.add(root.`val`)

        return findTarget(root.left, k, s) || findTarget(root.right, k, s)
    }
}
