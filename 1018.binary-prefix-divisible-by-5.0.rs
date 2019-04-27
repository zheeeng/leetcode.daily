/*
 * @lc app=leetcode id=1018 lang=rust
 *
 * [1018] Binary Prefix Divisible By 5
 */
impl Solution {
    pub fn prefixes_div_by5(a: Vec<i32>) -> Vec<bool> {
        let mut ret_vec = Vec::new();
        let mut acc = 0;
        for (i, &v) in a.iter().enumerate() {
            acc <<= 1;
            if v == 1 {
                acc += 1;
            }
            if acc >= 5 {
                acc -= 5;
            }
            if acc == 0 {
                ret_vec.push(true);
            } else {
                ret_vec.push(false);
            }
        }
        return ret_vec
    }
}
