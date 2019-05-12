/*
 * @lc app=leetcode id=278 lang=javascript
 *
 * [278] First Bad Version
 */
/**
 * Definition for isBadVersion()
 *
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
const solution = function(isBadVersion) {
    /**
     * @param {integer} n Total versions
     * @return {integer} The first bad version
     */
    return function rec (n, m = 1) {
        if (isBadVersion(m)) return m
        const mid = m + Math.ceil((n - m) / 2)

        const midVersionIsBad = isBadVersion(mid)

        return midVersionIsBad ? rec(mid - 1, m) : rec(n, mid + 1)
    }
}
