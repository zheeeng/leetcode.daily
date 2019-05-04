/*
 * @lc app=leetcode id=942 lang=golang
 *
 * [942] DI String Match
 */
func diStringMatch(S string) []int {
    max := len(S)
    ret := make([]int, max + 1)
    valueI := 0
    valueD := max
    for i, c := range S {
        if c == 'I' {
            ret[i] = valueI
            valueI++
        }
        if c == 'D' {
            ret[i] = valueD
            valueD--
        }
    }
    ret[max] = valueI
    return ret
}
