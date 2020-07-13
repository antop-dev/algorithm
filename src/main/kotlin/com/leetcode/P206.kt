package com.leetcode

// https://leetcode.com/problems/reverse-linked-list/
class P206 {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null

        var pre: ListNode? = null
        var node = head
        while (node != null) {
            val next = node.next
            node.next = pre
            pre = node
            node = next
        }
        return pre
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
