/*
 * @lc app=leetcode id=394 lang=javascript
 *
 * [394] Decode String
 */
/**
 * @param {string} s
 * @return {string}
 */
const decodeString = str => {
    const result = str.replace(
      /(\d+)\[(\w+)\]/g,
      (_, $2, $3) => $3.repeat($2),
    )

    if (/\[(.*)\]/g.test(result)) {
      return decodeString(result)
    }

    return result
}
