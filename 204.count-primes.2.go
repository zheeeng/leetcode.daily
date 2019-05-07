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
    primes := []int{2}
    loop:
        for i := 3; i < n; i++ {
            max := int(math.Sqrt(float64(i)))
            for _, p := range primes {
                if p > max {
                    break
                }
                if i % p == 0 {
                    continue loop
                }
            }
            primes = append(primes, i)
        }
    return len(primes)
}
