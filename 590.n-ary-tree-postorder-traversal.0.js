/*
 * @lc app=leetcode id=590 lang=javascript
 *
 * [590] N-ary Tree Postorder Traversal
 */
/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */
/**
 * @param {Node} root
 * @return {number[]}
 */
const flatMap = (fn, list) => list.map(fn).reduce((a, b) => [...a, ...b], [])

const postorder = function(root) {
    if (root == null) {
      return []
    }
    return [...flatMap(postorder, root.children), root.val]
}
