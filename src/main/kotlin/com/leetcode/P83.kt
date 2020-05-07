package com.leetcode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class P83 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null
        var prev: ListNode = head
        var node: ListNode = head
        while (node.next != null) {
            val next = node.next!!
            prev.next = null
            if (prev.`val` != next.`val`) {
                prev.next = next
                prev = next
            }
            node = next
        }
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}