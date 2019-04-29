/*
 * @lc app=leetcode id=949 lang=golang
 *
 * [949] Largest Time for Given Digits
 */
import (
    "fmt"
)

func extractMaxWithUpperBound(ns []int, b int) (max int, rest []int) {
    max = -1
    maxAt := 0
    for i, n := range ns {
        if n > max && n <= b {
            max = n
            maxAt = i
        }
    }
    rest = append(rest, ns[:maxAt]...)
    rest = append(rest, ns[maxAt+1:]...)
    return
}
func largestTimeFromDigits(ns []int) string {
    h1, ns1 := extractMaxWithUpperBound(ns, 2)
    h2 := 0
    ns2 := []int{}
    if h1 == 2 {
        h2, ns2 = extractMaxWithUpperBound(ns1, 3)
    } else {
        h2, ns2 = extractMaxWithUpperBound(ns1, 9)
    }

    h3, ns3 := extractMaxWithUpperBound(ns2, 5)
    h4, _ := extractMaxWithUpperBound(ns3, 9)

    if h1 == -1 || h2 == -1 {
        return ""
    }

    if h3 == -1 || h4 == -1 {
        h1, ns1 = extractMaxWithUpperBound(ns, 1)
        h2, ns2 = extractMaxWithUpperBound(ns1, 9)
        h3, ns3 = extractMaxWithUpperBound(ns2, 5)
        h4, _ = extractMaxWithUpperBound(ns3, 9)
    }

    if h1 == -1 || h2 == -1 || h3 == -1 || h4 == -1 {
        return ""
    }

    return fmt.Sprintf("%d%d:%d%d", h1, h2, h3, h4)
}
