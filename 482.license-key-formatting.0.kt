/*
 * @lc app=leetcode id=482 lang=kotlin
 *
 * [482] License Key Formatting
 */
class Solution_licenseKeyFormatting_0 {
    fun licenseKeyFormatting(S: String, K: Int): String {
        return S.replace("-", "").toUpperCase().reversed().chunked(K).joinToString("-").reversed()
    }
}
