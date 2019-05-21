/*
 * @lc app=leetcode id=671 lang=kotlin
 *
 * [671] Second Minimum Node In a Binary Tree
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
import kotlin.math.min

class Solution_findSecondMinimumValue_0 {
    fun findSecondMinimumValue(root: TreeNode?): Int {
        return when {
            root == null -> -1
            root.left == null || root.right == null -> -1
            root.left!!.`val` == root.right!!.`val` -> {
                (findSecondMinimumValue(root.left) to findSecondMinimumValue(root.right))
                    .let {
                    when {
                            it.first == -1 && it.second == -1 -> -1
                            it.first == -1 -> it.second
                            it.second == -1 -> it.first
                            else -> min(it.first, it.second)
                        }
                    }
            }
            root.left!!.`val` == root.`val` -> findSecondMinimumValue(root.left).let {
                if (it == -1) root.right!!.`val` else min(root.right!!.`val`, it)
            }
            root.right!!.`val` == root.`val` -> findSecondMinimumValue(root.right).let {
                if (it == -1) root.left!!.`val` else min(root.left!!.`val`, it)
            }
            else -> 0
        }
    }
}
