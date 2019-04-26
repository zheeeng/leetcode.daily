/*
 * @lc app=leetcode id=292 lang=rust
 *
 * [292] Nim Game
 */
impl Solution {
    pub fn can_win_nim(n: i32) -> bool {
        n % 4 != 0
    }
}
