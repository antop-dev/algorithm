package com.leetcode

import com.leetcode.P160.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

internal class P160Test {
    val p = P160()

    @Test
    fun `example 01`() {
        val c = ListNode(8).apply {
            next = ListNode(4).apply {
                next = ListNode(5)
            }
        }

        val a = ListNode(4).apply {
            next = ListNode(1).apply {
                next = c
            }
        }
        val b = ListNode(5).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = c
                }
            }
        }

        assertThat(p.getIntersectionNode(a, b), `is`(c))
    }

    @Test
    fun `example 02`() {
        val c = ListNode(2).apply {
            next = ListNode(4)
        }

        val a = ListNode(0).apply {
            next = ListNode(9).apply {
                next = ListNode(1).apply {
                    next = c
                }
            }
        }
        val b = ListNode(3).apply {
            next = c
        }

        assertThat(p.getIntersectionNode(a, b), `is`(c))
    }

    @Test
    fun `example 03`() {
        val a = ListNode(2).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val b = ListNode(1).apply {
            next = ListNode(5)
        }

        assertThat(p.getIntersectionNode(a, b), nullValue())
    }
}
