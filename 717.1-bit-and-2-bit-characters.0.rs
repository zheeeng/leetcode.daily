/*
 * @lc app=leetcode id=717 lang=rust
 *
 * [717] 1-bit and 2-bit Characters
 */
impl Solution {
    fn is_one_bit_c(mut bits: &[i32]) -> bool {
        while bits.len() > 0 {
            if bits[0] != 0 {
                break
            }
            bits = &bits[1..];
        }
        match bits {
            [] => true,
            [1, _] => false,
            _ => Solution::is_one_bit_c(&bits[2..]),
        }
    }
    pub fn is_one_bit_character(bits: Vec<i32>) -> bool {
        Solution::is_one_bit_c(&bits[..])
    }
}
