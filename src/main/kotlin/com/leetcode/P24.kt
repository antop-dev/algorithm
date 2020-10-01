package com.leetcode

// https://leetcode.com/problems/swap-nodes-in-pairs/
class P24 {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        val tmp = head.next
        head.next = swapPairs(head.next?.next)
        tmp?.next = head
        return tmp
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}
