/*
 * @lc app=leetcode id=155 lang=rust
 *
 * [155] Min Stack
 */
struct MinStack {
    vec: Vec<i32>,
    min_vec: Vec<i32>,
}


/**
 * `&self` means the method takes an immutable reference.
 * If you need a mutable reference, change it to `&mut self` instead.
 */
impl MinStack {

    /** initialize your data structure here. */
    fn new() -> Self {
        MinStack{
            vec: Vec::new(),
            min_vec: Vec::new(),
        }
    }

    fn push(&mut self, x: i32) {
        self.vec.push(x);
        if self.min_vec.len() == 0 || self.get_min() >= x {
            self.min_vec.push(x);
        }
    }

    fn pop(&mut self) {
        if self.vec.pop().unwrap() == self.get_min() {
            self.min_vec.pop();
        }
    }

    fn top(&self) -> i32 {
        *self.vec.last().unwrap()
    }

    fn get_min(&self) -> i32 {
        *self.min_vec.last().unwrap()
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * let obj = MinStack::new();
 * obj.push(x);
 * obj.pop();
 * let ret_3: i32 = obj.top();
 * let ret_4: i32 = obj.get_min();
 */
