/*
 * @lc app=leetcode id=762 lang=kotlin
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */
class Solution_countPrimeSetBits_0 {
    fun countPrimeSetBits(L: Int, R: Int): Int {
        val p  = setOf(2,3,5,7,11,13,17,19)

        return (L..R).filter {
            it.toString(2).filter { it == '1' }.length.let { p.contains(it) }
        }.size
    }
}
