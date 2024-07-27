package com.leetcode

import com.leetcode.P2130.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2130Test {
    val sut = P2130()

    @Test
    fun `example 1`() {
        val head = ListNode(5).apply {
            next = ListNode(4).apply {
                next = ListNode(2).apply {
                    next = ListNode(1)
                }
            }
        }
        assertThat(sut.pairSum(head), `is`(6))
    }

    @Test
    fun `example 2`() {
        val head = ListNode(4).apply {
            next = ListNode(2).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }
        }
        assertThat(sut.pairSum(head), `is`(7))
    }

    @Test
    fun `example 3`() {
        val head = ListNode(1).apply {
            next = ListNode(100000)
        }
        assertThat(sut.pairSum(head), `is`(100001));
    }

}
