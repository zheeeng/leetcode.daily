/*
 * @lc app=leetcode id=929 lang=kotlin
 *
 * [929] Unique Email Addresses
 */
class Solution_numUniqueEmails_0 {
    fun numUniqueEmails(emails: Array<String>): Int {
        return emails
            .groupBy {
                val (id, domain) = it.split("@").let { Pair(it.first().replace(".", ""), it.last()) }
                Pair(id.split("+").first(), domain)
            }
            .count()
    }
}
