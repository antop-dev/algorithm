package com.leetcode

import com.leetcode.P2807.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2807Test {
    val sut = P2807()

    @Test
    fun `example 1`() {
        val head = ListNode(18).apply {
            next = ListNode(6).apply {
                next = ListNode(10).apply {
                    next = ListNode(3)
                }
            }
        }

        val actual = sut.insertGreatestCommonDivisors(head)
        assertThat(actual?.toArray(), `is`(intArrayOf(18, 6, 6, 2, 10, 1, 3)))
    }

    @Test
    fun `example 2`() {
        val head = ListNode(7)

        val actual = sut.insertGreatestCommonDivisors(head)
        assertThat(actual?.toArray(), `is`(intArrayOf(7)))
    }

    private fun ListNode.toArray(): IntArray {
        val list = mutableListOf<Int>()
        var node: ListNode? = this
        while (node != null) {
            list += node.`val`
            node = node.next
        }
        return list.toIntArray()
    }

}
