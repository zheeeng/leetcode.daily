/*
 * @lc app=leetcode id=70 lang=rust
 *
 * [70] Climbing Stairs
 */
impl Solution {
    pub fn climb_stairs(n: i32) -> i32 {
        let mut pair = (1, 2);
        for i in 0..n-1 {
            pair = (pair.1, pair.0 + pair.1);
        }
        pair.0
    }
}
