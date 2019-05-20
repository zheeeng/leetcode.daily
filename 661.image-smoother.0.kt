/*
 * @lc app=leetcode id=661 lang=kotlin
 *
 * [661] Image Smoother
 */
class Solution_imageSmoother_0 {
    fun imageSmoother(M: Array<IntArray>): Array<IntArray> {
        return (0 until M.size).map { i ->
                (0 until M[0].size).map { j ->
                        listOf(
                            M.getOrNull(i-1)?.getOrNull(j-1),
                            M.getOrNull(i-1)?.getOrNull(j),
                            M.getOrNull(i-1)?.getOrNull(j+1),
                            M.getOrNull(i)?.getOrNull(j-1),
                            M.getOrNull(i)?.getOrNull(j),
                            M.getOrNull(i)?.getOrNull(j+1),
                            M.getOrNull(i+1)?.getOrNull(j-1),
                            M.getOrNull(i+1)?.getOrNull(j),
                            M.getOrNull(i+1)?.getOrNull(j+1)
                        ).filterNotNull().average().toInt()
                }.toIntArray()
        }.toTypedArray()
    }
}
