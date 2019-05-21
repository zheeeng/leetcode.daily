/*
 * @lc app=leetcode id=686 lang=kotlin
 *
 * [686] Repeated String Match
 */
class Solution_repeatedStringMatch_0 {
    fun repeatedStringMatch(A: String, B: String): Int {
        val lenA = A.length
        val lenB = B.length

        ((lenB / lenA)..(lenB / lenA + 2)).forEach {
            if (A.repeat(it).contains(B)) return it
        }

        return -1
    }
}
