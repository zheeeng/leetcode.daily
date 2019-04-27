/*
 * @lc app=leetcode id=1 lang=rust
 *
 * [1] Two Sum
 */
use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut map: HashMap<&i32, i32> = HashMap::new();
        for (i, v) in nums.iter().enumerate() {
            match map.get(&(target - *v)) {
                None => { map.insert(v, i as i32); }
                Some(index) => { return vec![*index, i as i32] }
            }
        }
        vec![]
    }
}
