/*
 * @lc app=leetcode id=429 lang=javascript
 *
 * [429] N-ary Tree Level Order Traversal
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
 * @return {number[][]}
 */
const flatMap = (fn, list) => list.map(fn).reduce((a, b) => [...a, ...b], [])

const spread = function * (children) {
  let list = []
  let next = children

  while (true) {
    list = next.map(c => c.val).filter(it => it != undefined)
    next = flatMap(n => n.children, next)
    if (list.length == 0) return list
    yield list
  }
}

const levelOrder = function(root) {
  if (!root) return []

  return [...spread([root])]
}
