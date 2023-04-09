package com.leetcode

// https://github.com/antop-dev/algorithm/issues/479
class P2181 {
    fun mergeNodes(head: ListNode?): ListNode? {
        if (head == null) return null

        var anchor = head
        var node = head.next // 두번째 노드부터 시작

        while (node != null) {
            if (node.`val` > 0) {
                anchor!!.`val` += node.`val`
            } else {
                if (node.next != null) { // 뒤에 더 있음
                    anchor!!.next = node
                    anchor = node
                } else { // 마지막 노드
                    anchor!!.next = null
                }
            }
            node = node.next
        }

        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
