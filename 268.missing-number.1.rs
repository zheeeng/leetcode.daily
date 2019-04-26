/*
 * @lc app=leetcode id=268 lang=rust
 *
 * [268] Missing Number
 */
impl Solution {
    pub fn missing_number(nums: Vec<i32>) -> i32 {
        let mut sum = 0;
        for (i, n) in nums.iter().enumerate() {
            sum += (i as i32) - n;
        }
        return sum + (nums.len() as i32)
    }
}
