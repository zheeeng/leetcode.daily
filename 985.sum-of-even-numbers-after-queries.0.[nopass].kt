/*
 * @lc app=leetcode id=985 lang=kotlin
 *
 * [985] Sum of Even Numbers After Queries
 */
// Time Limit Exceeded
class Solution_sumEvenAfterQueries_0 {
    fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>): IntArray {
        return queries.toList().fold(Pair(listOf<Int>(), A.toList())) { (resultList, list), query ->
            val newList = list.mapIndexed { i, v -> if (i == query[1]) (v + query[0]) else v }
            val result = newList.filter { it % 2 == 0 }.sum()

            Pair(resultList + result, newList)
        }.first.toIntArray()
    }
}
