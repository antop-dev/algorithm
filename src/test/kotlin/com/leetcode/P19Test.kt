package com.leetcode

import com.leetcode.P19.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P19Test {
    val sut = P19()

    @Test
    fun `example 01`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        val ans = sut.removeNthFromEnd(head, 2)
        assertThat(ans?.`val`, `is`(1))
        assertThat(ans?.next?.`val`, `is`(2))
        assertThat(ans?.next?.next?.`val`, `is`(3))
        assertThat(ans?.next?.next?.next?.`val`, `is`(5))
        assertThat(ans?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 02`() {
        val head = ListNode(1)
        val ans = sut.removeNthFromEnd(head, 1)
        assertThat(ans, nullValue())
    }

    @Test
    fun `example 03`() {
        val head = ListNode(1).apply {
            next = ListNode(2)
        }
        val ans = sut.removeNthFromEnd(head, 1)
        assertThat(ans?.`val`, `is`(1))
        assertThat(ans?.next, nullValue())
    }
}
