/*
 * @lc app=leetcode id=788 lang=kotlin
 *
 * [788] Rotated Digits
 */
class Solution_rotatedDigits_0 {
    fun test(N: Int): Boolean {
        return N.let {
            when {
                it < 10 -> when (it) {
                    2, 5, 6, 9 -> true
                    else -> false
                }
                it % 10 == 0 -> test(it / 10)
                else ->
                    it.toString().toList().filter { it != '0' } .let {
                        !it.all { it == '1' || it == '8' } &&
                            it.all {
                                when (it) {
                                    '0' -> true
                                    '1' -> true
                                    '8' -> true
                                    '2' -> true
                                    '5' -> true
                                    '6' -> true
                                    '9' -> true
                                    else -> false
                                }
                            }
                    }
            }
        }
    }
    fun rotatedDigits(N: Int): Int {
        return (0..N).filter(::test).count()
    }
}
