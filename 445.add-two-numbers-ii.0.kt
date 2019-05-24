/*
 * @lc app=leetcode id=445 lang=kotlin
 *
 * [445] Add Two Numbers II
 */
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution_addTwoNumbers_0 {
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = mutableListOf<Int>()
        var list2 = mutableListOf<Int>()

        var l = l1

        while (l != null) {
            list1.add(l.`val`)
            l = l.next
        }

        l = l2

        while (l != null) {
            list2.add(l.`val`)
            l = l.next
        }

        var carry = 0
        var resultNode: ListNode? = null

		while (list1.size > 0 || list2.size > 0) {
            val v = (if (list1.size > 0) list1.removeAt(list1.size - 1) else 0) + (if (list2.size > 0) list2.removeAt(list2.size - 1) else 0) + carry
            carry = if (v > 9) 1 else 0

            resultNode = ListNode(v % 10).apply { next = resultNode }
        }

        if (carry == 1) {
            resultNode = ListNode(1).apply { next = resultNode }
        }

        return resultNode
    }
}
