/*
 * @lc app=leetcode id=628 lang=kotlin
 *
 * [628] Maximum Product of Three Numbers
 */
import kotlin.math.max

class Solution_maximumProduct_0 {
    fun maximumProduct(nums: IntArray): Int {
        nums.sortedArrayDescending().let {
            val l = it.size
            val fst = it[0]

            val snd = it[1]
            val trd = it[2]

            val fst2 = it[l - 1]
            val snd2 = it[l - 2]

            return max(fst * snd * trd, fst * fst2 * snd2)
        }
    }
}
