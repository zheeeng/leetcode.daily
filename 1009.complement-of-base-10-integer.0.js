/*
 * @lc app=leetcode id=1009 lang=javascript
 *
 * [1009] Complement of Base 10 Integer
 */
/**
 * @param {number} N
 * @return {number}
 */
const bitwiseComplement = function(N) {
    if (N == 0) return 1
    let i = 1
    while (i < N) {
      i = i << 1
    }
    return ~N & (i - 1)
}
