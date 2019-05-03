/*
 * @lc app=leetcode id=914 lang=golang
 *
 * [914] X of a Kind in a Deck of Cards
 */
 func gdc(s, l int) int {
	if l%s == 0 {
		return s
	} else {
		return gdc(l%s, s)
	}
}

func hasGroupsSizeX(deck []int) bool {
    m := map[int]int{}
    for _, d := range deck {
        m[d] = m[d] + 1
    }
    minTimes := 0
    for _, t := range m {
        if minTimes == 0 {
            minTimes = t
        } else {
            minTimes = gdc(minTimes, t)
        }
        if minTimes < 2 {
            return false
        }
    }
    for _, t := range m {
        if t % minTimes != 0 {
            return false
        }
    }
    return true
}
