/*
 * @lc app=leetcode id=414 lang=kotlin
 *
 * [414] Third Maximum Number
 */
class Solution_thirdMax_0 {
    fun thirdMax(nums: IntArray): Int {
        var f: Int? = null
        var s: Int? = null
        var t: Int? = null

        nums.forEach {
            when {
                it == f || it == s || it == t -> {}
                f == null -> f = it
                it > f!! -> f = it.also { s = f.also { t = s } }
                s == null -> s = it
                it > s!! -> s = it.also { t = s }
                t == null -> t = it
                it > t!! -> t = it
            }
        }

        return t ?: f!!
    }
}
