package com.leetcode

import com.leetcode.P92.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P92Test {
    val p = P92()

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

        val answer = p.reverseBetween(head, 2, 4)

        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.next?.`val`, `is`(4))
        assertThat(answer?.next?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.next?.`val`, `is`(2))
        assertThat(answer?.next?.next?.next?.next?.`val`, `is`(5))
        assertThat(answer?.next?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 02`() {
        val head = ListNode(5)

        val answer = p.reverseBetween(head, 1, 1)

        assertThat(answer?.`val`, `is`(5))
        assertThat(answer?.next, nullValue())
    }

    @Test
    fun `example 03`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val answer = p.reverseBetween(head, 1, 4)

        assertThat(answer?.`val`, `is`(4))
        assertThat(answer?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.`val`, `is`(2))
        assertThat(answer?.next?.next?.next?.`val`, `is`(1))
        assertThat(answer?.next?.next?.next?.next?.`val`, `is`(5))
        assertThat(answer?.next?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 04`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val answer = p.reverseBetween(head, 1, 5)

        assertThat(answer?.`val`, `is`(5))
        assertThat(answer?.next?.`val`, `is`(4))
        assertThat(answer?.next?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.next?.`val`, `is`(2))
        assertThat(answer?.next?.next?.next?.next?.`val`, `is`(1))
        assertThat(answer?.next?.next?.next?.next?.next, nullValue())
    }

}
