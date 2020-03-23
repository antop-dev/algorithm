package com.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
internal class P2Test {
    val p = P2()

    @Test
    fun `example 1`() {
        val l1 = listNode(2, 4, 3)
        val l2 = listNode(5, 6, 4)

        Assertions.assertArrayEquals(
                intArrayOf(7, 0, 8),
                intArray(p.addTwoNumbers(l1, l2))
        )
    }

    @Test
    fun `example 2`() {
        val l1 = listNode(9)
        val l2 = listNode(1, 9, 9, 9, 9, 9, 9, 9, 9, 9)

        Assertions.assertArrayEquals(
                intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
                intArray(p.addTwoNumbers(l1, l2))
        )

    }

    private fun listNode(vararg nums: Int): P2.ListNode? {
        var root: P2.ListNode? = null
        var node: P2.ListNode? = null
        for (i in nums.indices) {
            val n = P2.ListNode(nums[i])

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

    private fun intArray(node: P2.ListNode?): IntArray {
        val list = mutableListOf<Int>()

        var n = node
        while (n != null) {
            list.add(n.`val`)
            n = n.next
        }

        return list.toIntArray()
    }
}