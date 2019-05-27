/*
 * @lc app=leetcode id=427 lang=javascript
 *
 * [427] Construct Quad Tree
 */
/**
 * // Definition for a QuadTree node.
 * function Node(val,isLeaf,topLeft,topRight,bottomLeft,bottomRight) {
 *    this.val = val;
 *    this.isLeaf = isLeaf;
 *    this.topLeft = topLeft;
 *    this.topRight = topRight;
 *    this.bottomLeft = bottomLeft;
 *    this.bottomRight = bottomRight;
 * };
 */
/**
 * @param {number[][]} grid
 * @return {Node}
 */
const construct = function(grid) {
  const len = grid.length

  if (len == 1) {
    return new Node(grid[0][0] == 1 ? true : false, true)
  } else {
    const g1 = construct(grid.slice(0, len / 2).map(it => it.slice(0, len / 2)))
    const g2 = construct(grid.slice(0, len / 2).map(it => it.slice(len / 2)))
    const g3 = construct(grid.slice(len / 2).map(it => it.slice(0, len / 2)))
    const g4 = construct(grid.slice(len / 2).map(it => it.slice(len / 2)))

    const isLeaf = g1.isLeaf && g2.isLeaf && g3.isLeaf && g4.isLeaf
    const isSame = g1.val == g2.val && g2.val == g3.val && g3.val == g4.val

    return (isLeaf && isSame) ? new Node(g1.val, true) : new Node(false, false, g1, g2, g3, g4)
  }
}
