package com.leetcode

// https://github.com/antop-dev/algorithm/issues/730
class P328 {
    fun oddEvenList(head: ListNode?): ListNode? {
        val oddHead = ListNode(0)
        val evenHead = ListNode(0)
        var oddNode = oddHead
        var evenNode = evenHead

        var node = head
        var count = 0
        while (node != null) {
            if (++count % 2 == 1) { // 홀수
                oddNode.next = node
                oddNode = node
            } else { // 짝수
                evenNode.next = node
                evenNode = node
            }
            node = node.next
        }

        evenNode.next = null
        oddNode.next = evenHead.next

        // return oddHead.next
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
