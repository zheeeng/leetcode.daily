/*
 * @lc app=leetcode id=3 lang=golang
 *
 * [3] Longest Substring Without Repeating Characters
 */
func max (a, b int) int {
    if a > b {
        return a
    }
    return b
}
func lengthOfLongestSubstring(s string) int {
    m, j, ret := map[rune]int{}, 0, 0
    for index, c := range s {
        if v, ok := m[c]; ok {
            j = max(j, v + 1)
        }
        m[c] = index
        ret = max(ret, index - j + 1)
    }
    return ret
}
