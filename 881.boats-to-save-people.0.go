/*
 * @lc app=leetcode id=881 lang=golang
 *
 * [881] Boats to Save People
 */
import "sort"
func numRescueBoats(people []int, limit int) int {
    sort.Ints(people)
    count, l, r := 0, 0, len(people) - 1
    for l <= r {
        if people[r] > limit {
            continue
        }
        count++
        if people[r] >= limit || people[r] + people[l] > limit {
            r--
            continue
        }
        r--
        l++
    }

    return count
}
