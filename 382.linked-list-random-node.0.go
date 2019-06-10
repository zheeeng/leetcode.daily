/*
 * @lc app=leetcode id=382 lang=golang
 *
 * [382] Linked List Random Node
 */
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
import "math/rand"

type Solution struct {
        head *ListNode
}

/** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
func Constructor(head *ListNode) Solution {
        return Solution{
                head: head,
        }
}

/** Returns a random node's value. */
func (this *Solution) GetRandom() int {
        t, n, i := this.head, this.head, 1
        for n != nil {
                if rand.Intn(i) == 0 {
                        t = n
                }
                n, i = n.Next, i + 1
        }
        return t.Val
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(head);
 * param_1 := obj.GetRandom();
 */
