/*
 * @lc app=leetcode id=107 lang=kotlin
 *
 * [107] Binary Tree Level Order Traversal II
 *
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 *
 * algorithms
 * Easy (46.07%)
 * Total Accepted:    217.7K
 * Total Submissions: 471.2K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, return the bottom-up level order traversal of its
 * nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 *
 *
 *
 * return its bottom-up level order traversal as:
 *
 * [
 * ⁠ [15,7],
 * ⁠ [9,20],
 * ⁠ [3]
 * ]
 *
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
class Solution_levelOrderBottom_0 {
    fun <T, R, V>zipWithPadding(a: T, b: R, iterA: Iterable<T>, iterB: Iterable<R>, transform: (a: T, b: R) -> V): List<V> = when {
        iterA.firstOrNull() != null && iterB.firstOrNull() != null ->
            listOf(transform(iterA.first(), iterB.first())) +
                zipWithPadding(a, b, iterA.drop(1), iterB.drop(1), transform)
        iterA.firstOrNull() == null && iterB.firstOrNull() == null ->
            listOf<V>()
        iterA.firstOrNull() == null ->
            listOf(transform(a, iterB.first())) +
                zipWithPadding(a, b, listOf<T>(), iterB.drop(1), transform)
        else ->
            listOf(transform(iterA.first(), b)) +
                zipWithPadding(a, b, iterA.drop(1), listOf<R>(), transform)
    }
    fun levelOrderTop(root: TreeNode?): List<List<Int>> = when {
        root == null -> listOf<List<Int>>()
        root.left == null && root.right == null -> listOf(listOf(root.`val`))
        else -> listOf(listOf(root.`val`)) + (zipWithPadding(
            listOf<Int>(),
            listOf<Int>(),
            levelOrderTop(root.left),
            levelOrderTop(root.right)
        ) {
            a, b -> a + b
        })
    }
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> = levelOrderTop(root).reversed()
}
