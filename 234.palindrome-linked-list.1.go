/*
 * @lc app=leetcode id=234 lang=golang
 *
 * [234] Palindrome Linked List
 */
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {
    if head == nil {
        return true
    }

    fast := head
    slow := head
    var prev *ListNode
    for fast != nil && fast.Next != nil {
        fast = fast.Next.Next
        tmp := slow.Next
        slow.Next = prev
        prev = slow
        slow = tmp
    }

    right := slow
    if fast != nil {
        right = slow.Next
    }
    left := prev

    for left != nil {
        if left.Val != right.Val {
            return false
        }

        left = left.Next
        right = right.Next
    }
    return true
}
