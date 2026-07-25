package com.leetcode

import com.leetcode.P1721.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1721Test {
    private val sut = P1721()

    @Test
    fun `example 1`() {
        val head = listOf(1, 2, 3, 4, 5).toListNode()
        val actual = sut.swapNodes(head, 2).toList()
        val expected = listOf(1, 4, 3, 2, 5)
        assertThat(actual, `is`(expected))
    }

    @Test
    fun `example 2`() {
        val head = listOf(7, 9, 6, 6, 7, 8, 3, 0, 9, 5).toListNode()
        assertThat(sut.swapNodes(head, 5).toList(), `is`(listOf(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)))
    }

    @Test
    fun `example 3`() {
        val head = listOf(1).toListNode()
        assertThat(sut.swapNodes(head, 1).toList(), `is`(listOf(1)))
    }

    private fun List<Int>.toListNode(): ListNode? {
        val dummy = ListNode(0)
        var curr = dummy
        for (v in this) {
            curr.next = ListNode(v)
            curr = curr.next!!
        }
        return dummy.next
    }

    private fun ListNode?.toList(): List<Int> {
        val result = mutableListOf<Int>()
        var node = this
        while (node != null) {
            result.add(node.`val`)
            node = node.next
        }
        return result
    }
}
