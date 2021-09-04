package com.leetcode

// https://github.com/antop-dev/algorithm/issues/324
class P143 {
    fun reorderList(head: ListNode?) {
        val list = mutableListOf<ListNode>()
        // node to list
        var node = head
        while (node != null) {
            list += node
            node = node.next
        }
        // switch
        var l = 0
        var r = list.lastIndex
        while (l < r) {
            list[l++].next = list[r]
            if (l < r) list[r--].next = list[l]
            if (l == r) list[r].next = null
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
