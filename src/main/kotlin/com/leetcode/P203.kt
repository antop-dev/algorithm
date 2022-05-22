package com.leetcode

// https://github.com/antop-dev/algorithm/issues/394
class P203 {
    var first: ListNode? = null

    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        r(null, head, `val`)
        return first
    }

    fun r(prev: ListNode?, node: ListNode?, v: Int) {
        if (node == null) return
        if (node.`val` != v) {
            if (first == null) first = node
            r(node, node.next, v)
        } else {
            prev?.next = node.next
            r(prev, node.next, v)
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
