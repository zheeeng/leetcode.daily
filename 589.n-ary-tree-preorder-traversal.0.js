/*
 * @lc app=leetcode id=589 lang=javascript
 *
 * [589] N-ary Tree Preorder Traversal
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

const preorder = function(root) {
    if (root == null) {
      return []
    }
    return [root.val, ...flatMap(preorder, root.children)]
}
