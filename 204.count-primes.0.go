/*
 * @lc app=leetcode id=204 lang=golang
 *
 * [204] Count Primes
 */
import (
    "math"
)
func countPrimes(n int) int {
    if n <= 2 {
        return 0
    }
    count := 0
    for i := 2; i < n; i++ {
        flag := false
        max := int(math.Sqrt(float64(i)))
        for j := 2; j <= max; j++ {
            if i % j == 0 {
                flag = true
                break
            }
        }
        if !flag {
            count++
        }
    }
    return count
}
