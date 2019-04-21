/*
 * @lc app=leetcode id=203 lang=golang
 *
 * [203] Remove Linked List Elements
 *
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * algorithms
 * Easy (35.46%)
 * Total Accepted:    217.8K
 * Total Submissions: 611.7K
 * Testcase Example:  '[1,2,6,3,4,5,6]\n6'
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 *
 */
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeElements(head *ListNode, val int) *ListNode {
	var h *ListNode
	var n *ListNode
	for head != nil {
		if head.Val != val {
			if h == nil {
				h = &ListNode{
					Val: head.Val,
				}
				n = h
			} else {
				n.Next = &ListNode{
					Val: head.Val,
				}
				n = n.Next
			}
		}
		head = head.Next
	}
	return h
}
