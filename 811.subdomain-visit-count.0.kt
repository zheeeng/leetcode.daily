/*
 * @lc app=leetcode id=811 lang=kotlin
 *
 * [811] Subdomain Visit Count
 */
class Solution_subdomainVisits_0 {
    fun subdomainVisits(cpdomains: Array<String>): List<String> {
        return cpdomains
            .flatMap {
                it.split(' ').let { chunks -> chunks[1].split('.').fold(listOf<List<String>>()) { acc, domain ->
                    listOf(domain).let { fresh ->
                            acc.map { it + fresh } + listOf(fresh)
                    }
                }.map { Pair(chunks[0].toInt(), it.joinToString(".")) } }
            }
            .groupBy { it.second }
            .mapValues { it.value.map { it.first }.sum() }
            .map { it.value.toString() + ' ' + it.key }
    }
}
