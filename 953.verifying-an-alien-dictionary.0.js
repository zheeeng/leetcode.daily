/*
 * @lc app=leetcode id=953 lang=javascript
 *
 * [953] Verifying an Alien Dictionary
 */
/**
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 */
var isAlienSorted = function(words, order) {
    try {
      words.map(word => word.split('')
        .map(c => order.indexOf(c).toString(26)).join(''))
        .reduce((p, c) => {
            if (p > c) {
                throw Error()
            }
            return c
        })
    } catch (e) {
        return false
    }

    return true
}
