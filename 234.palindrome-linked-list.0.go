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
    list := []int{}

    for head != nil {
        list = append(list, head.Val)
        head = head.Next
    }

    l := len(list)
    for i := 0; i < l / 2; i++ {
        if list[i] != list[l - i - 1] {
            return false
        }
    }
    return true
}
