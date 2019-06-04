/*
 * @lc app=leetcode id=443 lang=kotlin
 *
 * [443] String Compression
 */
class Solution_compress_0 {
    fun compress(cs: CharArray): Int {
        var chars = cs
        var i = 0
        var j = 1
        var l = chars.size - 1

        ((i + 1)..l).forEach { idx ->
            if (chars[idx] == chars[i]) {
                j++
            } else {
                if (j > 1) {
                    val charArray = j.toString().toCharArray()
                    charArray.forEachIndexed { index, char ->
                        chars[i + 1 + index] = char
                    }

                    chars[i + 1 + charArray.size] = chars[idx]
                    i = i + 1 + charArray.size
                } else {
                    chars[i + 1] = chars[idx]
                    i = i + 1
                }

                j = 1
            }
        }

        if (j > 1) {
            val charArray = j.toString().toCharArray()
            charArray.forEachIndexed { index, char ->
                chars[i + 1 + index] = char
            }

            i = i + charArray.size
        }

        return i + 1
    }
}
