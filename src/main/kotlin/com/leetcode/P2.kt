package com.leetcode

// https://github.com/antop-dev/algorithm/issues/33
class P2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var curr = ListNode(0)
        val root = curr

        var node1 = l1
        var node2 = l2
        var over = 0 // 일의 자리가 넘어감

        while (node1 != null || node2 != null || over > 0) {
            val x = node1?.`val` ?: 0
            val y = node2?.`val` ?: 0
            val v = over + x + y
            over = v / 10

            curr.next = ListNode(v % 10)
            curr = curr.next!!

            node1 = node1?.next
            node2 = node2?.next
        }

        return root.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
