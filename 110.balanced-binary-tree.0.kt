/*
 * @lc app=leetcode id=110 lang=kotlin
 *
 * [110] Balanced Binary Tree
 *
 * https://leetcode.com/problems/balanced-binary-tree/description/
 *
 * algorithms
 * Easy (40.60%)
 * Total Accepted:    308.2K
 * Total Submissions: 757.7K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 *
 * a binary tree in which the depth of the two subtrees of every node never
 * differ by more than 1.
 *
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *
 * ⁠      1
 * ⁠     / \
 * ⁠    2   2
 * ⁠   / \
 * ⁠  3   3
 * ⁠ / \
 * ⁠4   4
 *
 *
 * Return false.
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
class Solution_getBalancedAndDepth_0 {
    fun getBalancedAndDepth(root: TreeNode?): Pair<Boolean, Int> = when {
        root == null -> Pair(true, 0)
        root.left == null && root.right == null -> Pair(true, 1)
        else -> {
            val (isLeftBalanced, leftDepth) = getBalancedAndDepth(root.left)
            val (isRightBalanced, rightDepth) = getBalancedAndDepth(root.right)

            Pair(isLeftBalanced && isRightBalanced && (leftDepth - rightDepth).let{ v -> v <= 1 && v >= -1 }, 1 + maxOf(leftDepth, rightDepth))
        }
    }
    fun getBalancedAndDepth(root: TreeNode?): Boolean = getBalancedAndDepth(root).first
}
