/*
 * @lc app=leetcode id=69 lang=rust
 *
 * [69] Sqrt(x)
 */
impl Solution {
    pub fn my_sqrt(x: i32) -> i32 {
        let xx: i64 = x as i64;
        match xx {
            0 => 0,
            1 | 2 => 1,
            _ => {
                let mut i: i64 = 2;
                let mut m: i64 = 4;
                while i < xx && m <= xx {
                    i = i + 1;
                    m = i * i
                }
                (i - 1) as i32
            },
        }
    }
}
