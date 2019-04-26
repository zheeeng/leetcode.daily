/*
 * @lc app=leetcode id=172 lang=rust
 *
 * [172] Factorial Trailing Zeroes
 */
impl Solution {
    pub fn trailing_zeroes(n: i32) -> i32 {
        let num: i64 = n as i64;
        let mut c: i64 = 0;
        let mut p: i64 = 5;
        while num >= p {
            c += num / p;
            p *= 5;
        }
        c as i32
    }
}
