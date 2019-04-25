/*
 * @lc app=leetcode id=350 lang=golang
 *
 * [350] Intersection of Two Arrays II
 */
func intersect(nums1 []int, nums2 []int) (ret []int) {
    m1 := map[int]int{}
    m2 := map[int]int{}

    for _, n := range nums1 {
        m1[n] = m1[n]+1
    }
    for _, n := range nums2 {
        m2[n] = m2[n]+1
    }

    for n, t1 := range m1 {
        if t2, ok := m2[n]; ok {
            min := t1
            if t1 > t2 {
                min = t2
            }
            for i := 0; i < min; i++ {
                ret = append(ret, n)
            }
        }
    }
    return
}
