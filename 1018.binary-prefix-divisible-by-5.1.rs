/*
 * @lc app=leetcode id=1018 lang=rust
 *
 * [1018] Binary Prefix Divisible By 5
 */
impl Solution {
    pub fn prefixes_div_by5(a: Vec<i32>) -> Vec<bool> {
        a.iter().fold(
            (0, Vec::new()),
            |(mut acc, mut ret), inc| {
                acc = (acc << 1) + inc;
                acc = if acc >= 5 { acc - 5 } else { acc };
                ret.push(acc % 5 == 0);
                (acc, ret)
            }
        ).1
    }
}
