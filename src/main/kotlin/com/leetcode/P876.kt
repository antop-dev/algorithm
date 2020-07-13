package com.leetcode

// https://leetcode.com/problems/middle-of-the-linked-list/
class P876 {
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
