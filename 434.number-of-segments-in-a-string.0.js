/*
 * @lc app=leetcode id=434 lang=javascript
 *
 * [434] Number of Segments in a String
 */
/**
 * @param {string} s
 * @return {number}
 */
const countSegments = function(s) {
  return s.split(/\s/).filter(it => it).length
}
