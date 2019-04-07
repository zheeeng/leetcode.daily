/*
 * @lc app=leetcode id=204 lang=kotlin
 *
 * [204] Count Primes
 *
 * https://leetcode.com/problems/count-primes/description/
 *
 * algorithms
 * Easy (28.54%)
 * Total Accepted:    223.6K
 * Total Submissions: 782.6K
 * Testcase Example:  '10'
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 *
 *
 */
// 1. 2 to 3, 5, 7, 9, 11, 13, 15, 17...
// 2. 3 to 5, 7, 11, 13, 17...
// 3. 5 to 7, 11, 13, 17 ...
val primes = generateSequence(2 to generateSequence(3) { it + 2 }) {
    val currSeq = it.second.iterator()
    val nextPrime = currSeq.next()
    nextPrime to currSeq.asSequence().filter { it % nextPrime != 0 }
}.map { it.first }

// no pass: stack overflow
class Solution_countPrimes_0 {
    fun countPrimes(n: Int): Int {
        return primes.takeWhile() { it < n }.count()
    }
}
