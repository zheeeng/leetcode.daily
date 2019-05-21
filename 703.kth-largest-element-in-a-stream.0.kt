/*
 * @lc app=leetcode id=703 lang=kotlin
 *
 * [703] Kth Largest Element in a Stream
 */
class KthLargest(var k: Int, nums: IntArray) {
	var l = nums.sortedDescending().take(k)
    fun add(`val`: Int): Int {
        if (l.size < k) {
            l = l.filter { it > `val` } + `val` + l.filter { it <= `val` }
            return l.last()
        }

        if (`val` < l.last()) return l.last()

        l = l.dropLast(1).let { it.filter { it > `val` } + `val` + it.filter { it <= `val` } }

	    return l.last()
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */

