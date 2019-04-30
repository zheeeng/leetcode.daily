/*
 * @lc app=leetcode id=970 lang=golang
 *
 * [970] Powerful Integers
 */
import (
    "sort"
)
func powerfulIntegers(x int, y int, bound int) []int {
    xs := []int{1, x}
    ys := []int{1, y}
    for {
        nextX := xs[len(xs) - 1] * x
        if nextX > bound || nextX == 1 {
            break
        }
        xs = append(xs, nextX)
    }
    for {
        nextY := ys[len(ys) - 1] * y
        if nextY > bound || nextY == 1 {
            break
        }
        ys = append(ys, nextY)
    }
    m := map[int]struct{}{}
    for i := 0; i < len(xs); i++ {
        for j := 0; j < len(ys); j++ {
            v := xs[i] + ys[j]
            if v <= bound {
                m[v] = struct{}{}
            }
        }
    }

    ret := []int{}
    for i := range m {
        ret = append(ret, i)
    }
    sort.Ints(ret)
    return ret
}

