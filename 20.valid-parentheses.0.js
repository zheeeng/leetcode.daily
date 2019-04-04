/*
 * @lc app=leetcode id=20 lang=javascript
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.15%)
 * Total Accepted:    548.9K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
/**
 * @param {string} s
 * @return {boolean}
 */
const symbols = {
    '{': '}',
    '(': ')',
    '[': ']'
}

const inKeys = (obj, key) => key in obj
const inVals = (obj, val) => Object.keys(obj).some(key => obj[key] === val)

const isValid = function(s) {
    let met = []
    for (let c of s) {
    if (inKeys(symbols, c)) {
        met.push(c)
    }
    if (inVals(symbols, c)) {
        if (symbols[met.pop()] !== c) return false
    }
    }

    return met.length === 0 ? true : false
}
