package com.leetcode

import com.leetcode.P328.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P328Test {
    val sut = P328()

    @Test
    fun `example 01`() {
        // Input: head = [1,2,3,4,5]
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        val ans = sut.oddEvenList(head)
        // Output: [1,3,5,2,4]
        assertThat(ans?.`val`, `is`(1))
        assertThat(ans?.next?.`val`, `is`(3))
        assertThat(ans?.next?.next?.`val`, `is`(5))
        assertThat(ans?.next?.next?.next?.`val`, `is`(2))
        assertThat(ans?.next?.next?.next?.next?.`val`, `is`(4))
        assertThat(ans?.next?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 02`() {
        // Input: head = [2,1,3,5,6,4,7]
        val head = ListNode(2).apply {
            next = ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(5).apply {
                        next = ListNode(6).apply {
                            next = ListNode(4).apply {
                                next = ListNode(7)
                            }
                        }
                    }
                }
            }
        }
        val ans = sut.oddEvenList(head)
        // Output: [2,3,6,7,1,5,4]
        assertThat(ans?.`val`, `is`(2))
        assertThat(ans?.next?.`val`, `is`(3))
        assertThat(ans?.next?.next?.`val`, `is`(6))
        assertThat(ans?.next?.next?.next?.`val`, `is`(7))
        assertThat(ans?.next?.next?.next?.next?.`val`, `is`(1))
        assertThat(ans?.next?.next?.next?.next?.next?.`val`, `is`(5))
        assertThat(ans?.next?.next?.next?.next?.next?.next?.`val`, `is`(4))
        assertThat(ans?.next?.next?.next?.next?.next?.next?.next, nullValue())
    }
}
