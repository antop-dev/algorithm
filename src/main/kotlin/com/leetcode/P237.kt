package com.leetcode

// https://github.com/antop-dev/algorithm/issues/505
class P237 {
    fun deleteNode(node: ListNode?) {
        if (node == null) return
        node.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
