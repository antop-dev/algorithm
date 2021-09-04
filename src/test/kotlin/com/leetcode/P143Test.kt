package com.leetcode

import com.leetcode.P143.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P143Test {
    val p = P143()

    @Test
    fun `example 01`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }
        p.reorderList(head)

        assertThat(head.`val`, `is`(1))
        assertThat(head.next?.`val`, `is`(4))
        assertThat(head.next?.next?.`val`, `is`(2))
        assertThat(head.next?.next?.next?.`val`, `is`(3))
        assertThat(head.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 02`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        p.reorderList(head)

        assertThat(head.`val`, `is`(1))
        assertThat(head.next?.`val`, `is`(5))
        assertThat(head.next?.next?.`val`, `is`(2))
        assertThat(head.next?.next?.next?.`val`, `is`(4))
        assertThat(head.next?.next?.next?.next?.`val`, `is`(3))
        assertThat(head.next?.next?.next?.next?.next, nullValue())
    }
}
