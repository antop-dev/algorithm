package com.leetcode

class P21 {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val list = mutableListOf<Int>()

        var x = l1
        var y = l2
        while (x != null || y != null) {
            val xn = x?.`val` ?: Int.MAX_VALUE
            val yn = y?.`val` ?: Int.MAX_VALUE

            if (xn < yn) {
                list.add(xn)
                x = x?.next
            } else {
                list.add(yn)
                y = y?.next
            }
        }

        return listNode(list)
    }

    /**
     * List -> ListNode
     */
    private fun listNode(nums: List<Int>): ListNode? {
        var root: ListNode? = null
        var node: ListNode? = null
        for (i in nums.indices) {
            val n = ListNode(nums[i])

            if (root == null) root = n
            if (node == null) {
                node = n
            } else {
                node.next = n
                node = n
            }
        }
        return root
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}