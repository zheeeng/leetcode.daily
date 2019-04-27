/*
 * @lc app=leetcode id=20 lang=rust
 *
 * [20] Valid Parentheses
 */
impl Solution {
    pub fn is_valid(s: String) -> bool {
        let mut expected: Vec<char> = vec![];

        for c in s.chars() {
            match c {
                '(' => expected.push(')'),
                '[' => expected.push(']'),
                '{' => expected.push('}'),
                ')' | ']' | '}' => {
                    match expected.pop() {
                        None => {
                            return false
                        }
                        Some(e) if e != c => {
                            return false
                        }
                        _ => {}
                    }
                }
                _ => {}
            }
        }

        return expected.len() == 0
    }
}
