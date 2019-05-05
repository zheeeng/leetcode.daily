/*
 * @lc app=leetcode id=876 lang=golang
 *
 * [876] Middle of the Linked List
 */
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func middleNode(head *ListNode) *ListNode {
    fast := head
    slow := head
    for fast != nil {
        fast = fast.Next
        if fast != nil {
            fast = fast.Next
        } else {
            break
        }
        slow = slow.Next
    }
    return slow
}
