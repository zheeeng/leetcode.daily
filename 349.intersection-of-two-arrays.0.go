/*
 * @lc app=leetcode id=349 lang=golang
 *
 * [349] Intersection of Two Arrays
 */
func intersection(nums1 []int, nums2 []int) (ret []int) {
    s1 := map[int]struct{}{}
    s2 := map[int]struct{}{}

    for _, n := range nums1 {
        s1[n] = struct{}{}
    }
    for _, n := range nums2 {
        s2[n] = struct{}{}
    }

    for n, _ := range s1 {
        if _, ok := s2[n]; ok {
            ret = append(ret, n)
        }
    }
    return
}
