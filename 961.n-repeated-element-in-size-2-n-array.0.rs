/*
 * @lc app=leetcode id=961 lang=rust
 *
 * [961] N-Repeated Element in Size 2N Array
 */
impl Solution {
    pub fn repeated_n_times(a: Vec<i32>) -> i32 {
        let mut it = a.iter().cloned();
        let mut it2 = a.iter().cloned();
        it2.next();
        let ret = it.zip(it2).fold(-1, |ret, (p, c)| if (p == c) {p} else {ret});
        if (ret == -1) { if (a[0] == a[2] || a[0] == a[a.len() - 1]) {a[0]} else {a[1]} } else {ret}
    }
}
