/*
 * @lc app=leetcode id=438 lang=golang
 *
 * [438] Find All Anagrams in a String
 */
func findAnagrams(s string, p string) []int {
    if len(p) > len(s) {
        return []int{}
    }

    sLen := len(s)
    pLen := len(p)

    i := 0
    j := 0
    count := pLen

    pCount := map[byte]int{}

    for i := range p {
        pCount[p[i]]++
    }

    ret := []int{}

    for j < sLen {
        si := s[i]
        sj := s[j]
        if pCount[sj] > 0 {
            count--
        }
        pCount[sj]--
        j++
        if count == 0 {
            ret = append(ret, i)
        }
        if j - i == pLen {
            if pCount[si] >= 0 {
                count++
            }
            pCount[si]++
            i++
        }
    }

    return ret
}
