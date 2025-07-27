package com.leetcode

import com.leetcode.P2487.ListNode
import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2487Test {
    val sut = P2487()

    @Test
    fun `example 1`() {
        val head = makeListNode(5, 2, 13, 3, 8)
        val ans = sut.removeNodes(head)
        verifyListNode(ans, 13, 8)
    }

    @Test
    fun `example 2`() {
        val head = makeListNode(1, 1, 1, 1)
        val ans = sut.removeNodes(head)
        verifyListNode(ans, 1, 1, 1, 1)
    }

    private fun makeListNode(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (i in 1 until values.size) {
            current.next = ListNode(values[i])
            current = current.next!!
        }
        return head
    }

    private fun verifyListNode(head: ListNode?, vararg values: Int) {
        var current = head
        for (value in values) {
            assertThat(current?.`val`, `is`(value))
            current = current?.next
        }
        assertThat(current, nullValue())
    }

}