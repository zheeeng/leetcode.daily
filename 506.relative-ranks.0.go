/*
 * @lc app=leetcode id=506 lang=golang
 *
 * [506] Relative Ranks
 */
import (
	"strconv"
    "sort"
)
func findRelativeRanks(nums []int) []string {
    rankedScores := make([]int, len(nums))
    copy(rankedScores, nums)
    sort.Sort(sort.Reverse(sort.IntSlice(rankedScores)))
    rankedScoresMap := make(map[int]int, len(nums))
    for i, v := range rankedScores {
        rankedScoresMap[v] = i + 1
    }

    ret := make([]string, len(nums))

    for i, v := range nums {
        rank := strconv.Itoa(rankedScoresMap[v])
        switch rank {
        case "1":
            rank = "Gold Medal"
        case "2":
            rank = "Silver Medal"
        case "3":
            rank = "Bronze Medal"
        }
        ret[i] = rank
    }
    return ret
}
