/*
 * @lc app=leetcode id=917 lang=golang
 *
 * [917] Reverse Only Letters
 */
import (
    "fmt"
)
func reverseOnlyLetters(S string) string {
    bs := []byte(S)
    i, j := 0, len(S) - 1
    for i < j {
        if (bs[i] >= 'a' && bs[i] <= 'z') || (bs[i] >= 'A' && bs[i] <= 'Z') {
            for !(bs[j] >= 'a' && bs[j] <= 'z') && !(bs[j] >= 'A' && bs[j] <= 'Z') {
                j--
                if j == i {
                    break
                }
            }
            bs[i], bs[j] = bs[j], bs[i]
            j--
        }
        i++
    }

    return string(bs)
}
