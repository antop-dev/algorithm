package com.leetcode

// https://github.com/antop-dev/algorithm/issues/767
class P1721 {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        // 0-indexed list
        val list = mutableListOf<ListNode>()
        var node = head
        while (node != null) {
            list.add(node)
            node = node.next
        }
        // swap
        val left = list[k - 1]
        val right = list[list.size - k]
        val temp = left.`val`
        left.`val` = right.`val`
        right.`val` = temp

        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
