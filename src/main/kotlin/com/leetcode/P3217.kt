package com.leetcode

import java.util.Stack

// https://github.com/antop-dev/algorithm/issues/786
class P3217 {
    fun modifyList(nums: IntArray, head: ListNode?): ListNode? {
        val set = nums.toSet()
        val root = ListNode(-1).apply { next = head }
        val stack = Stack<ListNode>()
        stack += root

        var node = head
        while (node != null) {
            if (node.`val` in set) {
                stack.peek().next = node.next
            } else {
                stack += node
            }
            node = node.next
        }

        return root.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
