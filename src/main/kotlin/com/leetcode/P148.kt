package com.leetcode


// https://github.com/antop-dev/algorithm/issues/499
class P148 {
    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        // get the middle of the list
        val middle = middle(head)
        val nextOfMiddle = middle?.next
        // set the next of middle node to null
        middle?.next = null
        // Apply mergeSort on left list
        val left = sortList(head)
        // Apply mergeSort on right list
        val right = sortList(nextOfMiddle)
        // Merge the left and right lists
        val sortedList = sortedMerge(left, right);
        return sortedList
    }

    private fun sortedMerge(left: ListNode?, right: ListNode?): ListNode? {
        if (left == null) return right
        if (right == null) return left
        /* Pick either left or right, and recur */
        return if (left.`val` <= right.`val`) {
            left.next = sortedMerge(left.next, right)
            left
        } else {
            right.next = sortedMerge(left, right.next)
            right
        }
    }

    private fun middle(node: ListNode?): ListNode? {
        if (node == null) return null
        var slow = node
        var fast = node
        while (slow?.next != null && fast?.next?.next != null) {
            slow = slow.next
            fast = fast.next!!.next
        }
        return slow
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}
