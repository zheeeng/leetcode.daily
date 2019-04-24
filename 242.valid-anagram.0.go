/*
 * @lc app=leetcode id=242 lang=golang
 *
 * [242] Valid Anagram
 */
func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    }

    m1 := map[rune]int{}
    m2 := map[rune]int{}

    for _, c := range s {
        if v, ok := m1[c]; ok {
            m1[c] = v + 1
        } else {
            m1[c] = 0
        }
    }
    for _, c := range t {
        if v, ok := m2[c]; ok {
            m2[c] = v + 1
        } else {
            m2[c] = 0
        }
    }

    if len(m1) != len(m2) {
        return false
    }

    for c, i := range m1 {
        if v, ok := m2[c]; !ok || v != i {
            return false
        }
    }

    return true
}
