/*
 * @lc app=leetcode id=693 lang=kotlin
 *
 * [693] Binary Number with Alternating Bits
 */
class Solution_hasAlternatingBits_0 {
    fun hasAlternatingBits(n: Int): Boolean {
        return n.toString(2).zipWithNext().fold(true) { acc , (prev, curr) ->
            acc && prev != curr
        }
    }
}
