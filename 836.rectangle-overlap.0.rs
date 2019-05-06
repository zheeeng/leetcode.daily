/*
 * @lc app=leetcode id=836 lang=rust
 *
 * [836] Rectangle Overlap
 */
impl Solution {
    pub fn is_rectangle_overlap(rec1: Vec<i32>, rec2: Vec<i32>) -> bool {
        let r1 = rec1.as_slice();
        let r2 = rec2.as_slice();
        !(r1[0] >= r2[2] || r1[2] <= r2[0] || r1[1] >= r2[3] || r1[3] <= r2[1])
    }
}
