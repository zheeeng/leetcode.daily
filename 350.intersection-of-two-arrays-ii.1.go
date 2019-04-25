/*
 * @lc app=leetcode id=350 lang=golang
 *
 * [350] Intersection of Two Arrays II
 */
func intersect(nums1 []int, nums2 []int) (ret []int) {
    m := map[int]int{}

    for _, n := range nums1 {
        m[n] = m[n]+1
    }

    for _, n := range nums2 {
        if t, ok := m[n]; ok && t > 0 {
            ret = append(ret, n)
            m[n] = t - 1
        }
    }
    return
}
