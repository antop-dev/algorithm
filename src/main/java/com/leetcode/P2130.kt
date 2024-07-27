package com.leetcode

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
class P2130 {
    fun pairSum(head: ListNode?): Int {
        var prev: ListNode? = null
        var slow = head
        var fast = head
        while (fast != null) {
            fast = fast.next?.next
            val next = slow?.next
            if (slow != null) slow.next = prev
            prev = slow
            slow = next
        }

        var ans = 0
        while (prev != null && slow != null) {
            ans = maxOf(ans, prev.`val` + slow.`val`)
            prev = prev.next
            slow = slow.next
        }
        return ans
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
