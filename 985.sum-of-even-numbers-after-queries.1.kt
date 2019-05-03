/*
 * @lc app=leetcode id=985 lang=kotlin
 *
 * [985] Sum of Even Numbers After Queries
 */
class Solution_sumEvenAfterQueries_1 {
    fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>): IntArray {
        var evenSum = A.filter { it % 2 == 0 }.sum()
        var result = IntArray(queries.size) { 0 }
        queries.forEachIndexed { index, query ->
            A[query[1]] += query[0]
            when (Pair(A[query[1]] % 2 == 0, query[0] % 2 == 0)) {
                Pair(true, true) -> evenSum += query[0]
                Pair(true, false) -> evenSum += A[query[1]]
                Pair(false, true) -> {}
                Pair(false, false) -> evenSum -= A[query[1]] - query[0]
            }
            result[index] = evenSum
        }
        return result
    }
}
