/*
 * @lc app=leetcode id=888 lang=golang
 *
 * [888] Fair Candy Swap
 */
func fairCandySwap(A []int, B []int) []int {
    sumA := 0
    sumB := 0
    for _, n := range A {
        sumA += n
    }
    for _, n := range B {
        sumB += n
    }
    sum := sumA + sumB
    exchange := sum / 2 - sumA
    for _, n1 := range A {
        for _, n2 := range B {
            if n1 + exchange == n2 {
                return []int{n1, n2}
            }
        }
    }

    return []int{}
}
