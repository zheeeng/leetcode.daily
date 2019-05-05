/*
 * @lc app=leetcode id=868 lang=golang
 *
 * [868] Binary Gap
 */
import (
    "fmt"
)
func binaryGap(N int) int {
    bs := fmt.Sprintf("%b", N)
    maxDis := 0
    last := -1
    for i, c := range bs {
        if c == '1' {
            if last != -1 {
                dis := i - last
                if dis > maxDis {
                    maxDis = dis
                }
            }
            last = i
        }
    }
    return maxDis
}
