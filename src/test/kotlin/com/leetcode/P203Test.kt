package com.leetcode

import com.leetcode.P203.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P203Test {
    val p = P203()

    @Test
    fun `example 01`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(6).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(6)
                            }
                        }
                    }
                }
            }
        }

        val actual = p.removeElements(head, 6)
        assertThat(actual?.`val`, `is`(1))
        assertThat(actual?.next?.`val`, `is`(2))
        assertThat(actual?.next?.next?.`val`, `is`(3))
        assertThat(actual?.next?.next?.next?.`val`, `is`(4))
        assertThat(actual?.next?.next?.next?.next?.`val`, `is`(5))
    }

    @Test
    fun `example 02`() {
        val head = ListNode(7).apply {
            next = ListNode(7).apply {
                next = ListNode(7).apply {
                    next = ListNode(7)
                }
            }
        }

        val actual = p.removeElements(head, 7)
        assertThat(actual, Matchers.nullValue())
    }

}
