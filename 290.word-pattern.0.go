/*
 * @lc app=leetcode id=290 lang=golang
 *
 * [290] Word Pattern
 */
import (
    "strings"
)

func wordPattern(pattern string, str string) bool {
    chunks := strings.Split(str, " ")
    if len(pattern) != len(chunks) {
        return false
    }

    c := 0
    s1 := map[rune]int{}
    s2 := map[string]int{}

    for i, x := range pattern {
        t1, ok1 := s1[x]
        t2, ok2 := s2[chunks[i]]

        if ok1 != ok2 || t1 != t2 {
            return false
        }

        if !ok1 {
            s1[x] = c
            s2[chunks[i]] = c
        } else {
            s1[x] = t1 + 1
            s2[chunks[i]] = t2 + 1
        }
        c++
    }
    return true
}
