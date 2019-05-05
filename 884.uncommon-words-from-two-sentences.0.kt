/*
 * @lc app=leetcode id=884 lang=kotlin
 *
 * [884] Uncommon Words from Two Sentences
 */
class Solution_uncommonFromSentences_0 {
    fun uncommonFromSentences(A: String, B: String): Array<String> {
        val unionSet = A.split(' ').plus(B.split(' ')).groupBy { it }.filter { it.value.size == 1 }.keys
        val intersectionSet = A.split(' ').toSet().intersect(B.split(' ').toSet())

        return unionSet.subtract(intersectionSet).toTypedArray()
    }
}
