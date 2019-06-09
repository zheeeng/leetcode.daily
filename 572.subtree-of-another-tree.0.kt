/*
 * @lc app=leetcode id=572 lang=kotlin
 *
 * [572] Subtree of Another Tree
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
class Solution_isSubtree_0 {
    fun isSameTree(s: TreeNode?, t: TreeNode?): Boolean {
        if (t == null) {
            if (s == null) return true
            else return false
        }
        if (s == null) return false
        if (s.`val` != t.`val`) return false
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right)
    }
    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        if (t == null) return true
        if (s == null) return false

        return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t)
    }
}
