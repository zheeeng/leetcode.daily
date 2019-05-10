/*
 * @lc app=leetcode id=830 lang=kotlin
 *
 * [830] Positions of Large Groups
 */
class Solution_largeGroupPositions_0 {
    fun largeGroupPositions(S: String): List<List<Int>> {
        return S.drop(1).foldIndexed(Pair(S[0], listOf(Pair(0, 1)))) { index, (lastChar, countList), ch ->
            if (ch != lastChar)
                Pair(ch, countList + listOf(Pair(index + 1, 1))) else
                Pair(ch, countList.dropLast(1) + countList.last().let { Pair(it.first, it.second + 1) })
        }.second.filter { it.second >= 3 }.map { listOf(it.first, it.first + it.second - 1) }
    }
}
