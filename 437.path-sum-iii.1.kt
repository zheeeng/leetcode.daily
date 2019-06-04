/*
 * @lc app=leetcode id=437 lang=kotlin
 *
 * [437] Path Sum III
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
class Solution_pathSum_1 {
    fun getPaths(root: TreeNode?): Pair<List<Int>, List<Int>> {
        if (root == null) return Pair(listOf<Int>(), listOf<Int>())

        val self = listOf(root.`val`)

        val (leftMut, leftInmmut) = getPaths(root.left)

        val (rightMut, rightInmmut) = getPaths(root.right)

        val nextMut = (leftMut + rightMut)
            .map {
                root.`val` + it
            } + self

        val nextImmut = nextMut + leftInmmut + rightInmmut
        return Pair(nextMut, nextImmut)
    }

    fun pathSum(root: TreeNode?, sum: Int): Int {
        return getPaths(root).second.filter { it == sum }.size
    }
}
