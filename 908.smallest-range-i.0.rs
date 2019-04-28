/*
 * @lc app=leetcode id=908 lang=rust
 *
 * [908] Smallest Range I
 */
impl Solution {
    pub fn smallest_range_i(a: Vec<i32>, k: i32) -> i32 {
        if a.len() == 0 {
            return 0
        }

        let (max, min) = a.iter().fold((a[0], a[0]), |acc, cur| {
            match acc {
                (max, min) if cur > &max => (*cur, min),
                (max, min) if cur < &min => (max, *cur),
                _ => acc,
            }
        });

        if max - min <= 2 * k {
            return 0
        }

        return max - min - 2 * k
    }
}
