/*
 * @lc app=leetcode id=155 lang=golang
 *
 * [155] Min Stack
 *
 * https://leetcode.com/problems/min-stack/description/
 *
 * algorithms
 * Easy (36.20%)
 * Total Accepted:    284.1K
 * Total Submissions: 782.4K
 * Testcase Example:  '["MinStack","push","push","push","getMin","pop","top","getMin"]\n[[],[-2],[0],[-3],[],[],[],[]]'
 *
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 *
 *
 * push(x) -- Push element x onto stack.
 *
 *
 * pop() -- Removes the element on top of the stack.
 *
 *
 * top() -- Get the top element.
 *
 *
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 *
 *
 */
type MinStack struct {
	Vals    []int
	MinVals []int
}

/** initialize your data structure here. */
func Constructor() MinStack {
	return MinStack{}
}

func (this *MinStack) Push(x int) {
	this.Vals = append(this.Vals, x)
	if len(this.MinVals) == 0 || x <= this.MinVals[len(this.MinVals)-1] {
		this.MinVals = append(this.MinVals, x)
	}
}

func (this *MinStack) Pop() {
	if len(this.Vals) <= 0 {
		return
	}

	if this.Vals[len(this.Vals)-1] == this.MinVals[len(this.MinVals)-1] {
		this.MinVals = this.MinVals[0 : len(this.MinVals)-1]
	}
	this.Vals = this.Vals[0 : len(this.Vals)-1]
}

func (this *MinStack) Top() int {
	return this.Vals[len(this.Vals)-1]
}

func (this *MinStack) GetMin() int {
	return this.MinVals[len(this.MinVals)-1]
}

/**
 * Your MinStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.GetMin();
 */
