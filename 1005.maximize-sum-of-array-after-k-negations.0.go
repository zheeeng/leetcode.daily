/*
 * @lc app=leetcode id=1005 lang=golang
 *
 * [1005] Maximize Sum Of Array After K Negations
 */
import (
    "sort"
    "fmt"
)
func largestSumAfterKNegations(A []int, K int) int {
    sum := 0

    for i := 0; i < len(A); i++ {
        sum += A[i]
    }

    sort.Ints(A)

    if A[K - 1] <= 0 {
        sumK := 0
        for i := 0; i < K; i++ {
            sumK += A[i]
        }
        return sum - 2 * sumK
    }

    if A[0] >= 0 {
        if K % 2 == 0 {
            return sum
        }
        return sum - 2 * A[0]
    }

    sumN := 0
    i := 0
    for A[i] < 0 {
        sumN += A[i]

        i++
    }

    if (K - i) % 2 == 0 {
        return sum - 2 * sumN
    }

    p := -A[i - 1]
    if p > A[i] {
        p = A[i]
    }

    return sum - 2 * sumN - 2 * p
}
