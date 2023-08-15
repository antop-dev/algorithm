package com.leetcode

import com.leetcode.P148.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.jupiter.api.Test

class P148Test {
    val sut = P148()

    @Test
    fun `example 1`() {
        val head = ListNode(4).apply {
            next = ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(3)
                }
            }
        }

        val answer = sut.sortList(head)

        assertThat(answer, notNullValue())
        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.next?.`val`, `is`(2))
        assertThat(answer?.next?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.next?.`val`, `is`(4))
        assertThat(answer?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 2`() {
        val head = ListNode(-1).apply {
            next = ListNode(5).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(0)
                    }
                }
            }
        }

        val answer = sut.sortList(head)

        assertThat(answer, notNullValue())
        assertThat(answer?.`val`, `is`(-1))
        assertThat(answer?.next?.`val`, `is`(0))
        assertThat(answer?.next?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.next?.`val`, `is`(4))
        assertThat(answer?.next?.next?.next?.next?.`val`, `is`(5))
        assertThat(answer?.next?.next?.next?.next?.next, nullValue())
    }

}
