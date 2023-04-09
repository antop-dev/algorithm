package com.leetcode

import com.leetcode.P2181.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P2181Test {
    val sut = P2181()

    @Test
    fun `example 1`() {
        val head = ListNode(0).apply {
            next = ListNode(3).apply {
                next = ListNode(1).apply {
                    next = ListNode(0).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(2).apply {
                                    next = ListNode(0)
                                }
                            }
                        }
                    }
                }
            }
        }

        val answer = sut.mergeNodes(head)

        assertThat(answer?.`val`, `is`(4))
        assertThat(answer?.next?.`val`, `is`(11))
        assertThat(answer?.next?.next, nullValue())
    }

    @Test
    fun `example 2`() {
        val head = ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(0).apply {
                    next = ListNode(3).apply {
                        next = ListNode(0).apply {
                            next = ListNode(2).apply {
                                next = ListNode(2).apply {
                                    next = ListNode(0)
                                }
                            }
                        }
                    }
                }
            }
        }

        val answer = sut.mergeNodes(head)

        assertThat(answer?.`val`, `is`(1))
        assertThat(answer?.next?.`val`, `is`(3))
        assertThat(answer?.next?.next?.`val`, `is`(4))
        assertThat(answer?.next?.next?.next, nullValue())
    }

}
