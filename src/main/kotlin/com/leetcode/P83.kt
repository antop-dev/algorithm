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
        val root = ListNode(head.`val`)

        var previous = root
        var next = head.next
        while (next != null) {
            if (previous.`val` != next.`val`) {
                val node = ListNode(next.`val`)
                previous.next = node
                previous = node
            }
            next = next.next
        }
        return root
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}