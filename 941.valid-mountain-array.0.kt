/*
 * @lc app=leetcode id=941 lang=kotlin
 *
 * [941] Valid Mountain Array
 */
class Solution_validMountainArray_0 {
    fun validMountainArray(A: IntArray): Boolean {
        if (A.size < 2) {
            return false
        }
        var isMountaining = true

        val zipped = A.toList().zipWithNext()

        return zipped.drop(1).fold(zipped[0].second > zipped[0].first) { ret, (prev, curr) ->
            if (curr == prev) return false
            val isGt = curr > prev
            if (!isGt) {
                isMountaining = false
            } else if (!isMountaining) {
                return false
            }
            ret && !(isGt xor isMountaining)
        } && !isMountaining
    }
}
