/*
 * @lc app=leetcode id=405 lang=kotlin
 *
 * [405] Convert a Number to Hexadecimal
 */
class Solution_toHex_0 {
    fun longToHex(num: Long): String {
		if (num < 0) return longToHex(Int.MAX_VALUE.toLong() * 2 + num + 2)
        return (num % 16).let {
            if (num > 15) {
              longToHex(num / 16)  + it.toString(16)
            }  else {
	          it.toString(16)
            }
        }
    }

    fun toHex(num: Int): String {
		if (num < 0) return longToHex(num.toLong())
        return (num % 16).let {
            if (num > 15) {
              toHex(num / 16)  + it.toString(16)
            }  else {
	          it.toString(16)
            }
        }
    }
}
