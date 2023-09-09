package com.leetcode

// https://github.com/antop-dev/algorithm/issues/507
class P86 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        if (head == null) return null

        var left = ListNode(0)
        var right = ListNode(0)
        val leftAnchor = left
        val rightAnchor = right

        var node = head
        while (node != null) {
            if (node.`val` < x) {
                left.next = node
                left = node
            } else {
                right.next = node
                right = node
            }
            node = node.next
        }

        right.next = null
        left.next = rightAnchor.next

        return leftAnchor.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
