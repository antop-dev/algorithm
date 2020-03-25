package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class P21Test {
    val p = P21()

    @Test
    fun example() {
        val l1 = listNode(1, 2, 4)
        val l2 = listNode(1, 3, 4)

        assertArrayEquals(
                intArrayOf(1, 1, 2, 3, 4, 4),
                intArray(p.mergeTwoLists(l1, l2))
        )
    }

    private fun listNode(vararg nums: Int): P21.ListNode? {
        var root: P21.ListNode? = null
        var node: P21.ListNode? = null
        for (i in nums.indices) {
            val n = P21.ListNode(nums[i])

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

    private fun intArray(node: P21.ListNode?): IntArray {
        val list = mutableListOf<Int>()

        var n = node
        while (n != null) {
            list.add(n.`val`)
            n = n.next
        }
        return list.toIntArray()
    }
}