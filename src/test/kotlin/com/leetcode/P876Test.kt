package com.leetcode

import com.leetcode.P876.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P876Test {
    val p = P876()

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

        val middle = p.middleNode(head)

        assertThat(middle?.`val`, `is`(3))
        assertThat(middle?.next?.`val`, `is`(4))
        assertThat(middle?.next?.next?.`val`, `is`(5))
    }

    @Test
    fun `example 02`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val middle = p.middleNode(head)

        assertThat(middle?.`val`, `is`(4))
        assertThat(middle?.next?.`val`, `is`(5))
        assertThat(middle?.next?.next?.`val`, `is`(6))
    }
}
