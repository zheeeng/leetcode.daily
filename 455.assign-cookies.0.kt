/*
 * @lc app=leetcode id=455 lang=kotlin
 *
 * [455] Assign Cookies
 */
class Solution_findContentChildren_0 {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var ga = g.sortedArrayDescending()
        var sa = s.sortedArrayDescending()
        var count = 0
        var j = 0
        for (i in 0 until sa.size) {
            while (j < ga.size) {
                if (sa[i] >= ga[j]) {
                    count++
                    j++
                    break
                }
                j++
            }
        }
        return count
    }
}
