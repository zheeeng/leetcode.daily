/*
 * @lc app=leetcode id=204 lang=golang
 *
 * [204] Count Primes
 */
// Time Limit Exceeded
func countPrimes(n int) int {
    if n <= 2 {
        return 0
    }
    primes := []int{2}
    loop:
        for i := 3; i < n; i++ {
            for _, p := range primes {
                if i % p == 0 {
                    continue loop
                }
            }
            primes = append(primes, i)
        }
    return len(primes)
}
