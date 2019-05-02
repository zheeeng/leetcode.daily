/*
 * @lc app=leetcode id=997 lang=golang
 *
 * [997] Find the Town Judge
 */
func findJudge(N int, trust [][]int) int {
    for i := 1; i <= N; i++ {
        count := 1
        shouldSkip := false
        for _, t := range trust {
            if t[0] == i {
                shouldSkip = true
                break
            }
            if t[1] == i {
                count++
            }
        }
        if shouldSkip {
            continue
        }
        if count == N {
            return i
        }
    }
    return -1
}
