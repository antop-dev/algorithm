package com.leetcode

// https://leetcode.com/problems/linked-list-cycle/
class P141 {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false

        var p1: ListNode? = head.next
        var p2: ListNode? = head.next?.next
        var cycle = false

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                cycle = true
                break;
            }
            p1 = p1.next // +1 step
            p2 = p2.next?.next // +2 step
        }

        return cycle
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
