/*
 * @lc app=leetcode id=268 lang=rust
 *
 * [268] Missing Number
 */
impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        nums.iter().enumerate().fold(0, |s, (i, n) | s + i  as i32 - n) + nums.len() as i32
    }
}
