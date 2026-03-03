package com.leetcode

// https://github.com/antop-dev/algorithm/issues/726
class P19 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) {
            return null
        }
        val root = ListNode(0).apply {
            next = head
        }
        var left: ListNode? = root
        // right를 n만큼 이동
        var right = head
        for (i in 0 until n) {
            right = right?.next
        }
        // 두 노드 포인트를 끝까지 이동
        while (right != null) {
            left = left?.next
            right = right.next
        }
        // left 다음 노드가 제거 노드
        left?.let { it.next = it.next?.next }

        return root.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
