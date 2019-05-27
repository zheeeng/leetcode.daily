/*
 * @lc app=leetcode id=415 lang=kotlin
 *
 * [415] Add Strings
 */
class Solution_addStrings_0 {
    fun addStrings(num1: String, num2: String): String {
        var l1 = num1.toMutableList()
        var l2 = num2.toMutableList()
        var ret = ""
        var carry = 0

        while (!l1.isEmpty() || !l2.isEmpty()) {
            val i1 = (if (l1.size > 0) l1.removeAt(l1.size - 1).toString().toInt() else 0)
            val i2 = (if (l2.size > 0) l2.removeAt(l2.size - 1).toString().toInt() else 0)
            val bitSum = i1 + i2 + carry
            ret = (bitSum % 10).toString() + ret
            carry = if (bitSum > 9) 1 else 0
        }

        if (carry == 1) {
            ret = "1" + ret
        }

        return ret
    }
}

