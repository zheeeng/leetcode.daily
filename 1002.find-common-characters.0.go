/*
 * @lc app=leetcode id=1002 lang=golang
 *
 * [1002] Find Common Characters
 */
func commonChars(A []string) []string {
    sets := []map[rune]int{}
    for _, a := range A {
        set := map[rune]int{}
        for _, c := range a {
            set[c] = set[c] + 1
        }
        sets = append(sets, set)
    }

    acc := sets[0]
    for _, set := range sets[0:] {
        next := map[rune]int{}
        for b, times1 := range set {
            if times2, ok := acc[b]; ok {
                min := times1
                if times2 < times1 {
                    min = times2
                }
                next[b] = min
            }
        }
        acc = next
    }

    ret := []string{}
    for c, times := range acc {
        for i := 0; i < times; i++ {
            ret = append(ret, string(c))
        }
    }
    return ret
}

