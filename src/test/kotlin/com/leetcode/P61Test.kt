package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P61Test {
    val sut = P61()

    @Test
    fun `example 1`() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }
        val root = sut.rotateRight(head, 2)

        assertThat(root?.`val`, `is`(4))
        assertThat(root?.next?.`val`, `is`(5))
        assertThat(root?.next?.next?.`val`, `is`(1))
        assertThat(root?.next?.next?.next?.`val`, `is`(2))
        assertThat(root?.next?.next?.next?.next?.`val`, `is`(3))
        assertThat(root?.next?.next?.next?.next?.next, nullValue())
    }

    @Test
    fun `example 2`() {
        val head = ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(2)
            }
        }

        val root = sut.rotateRight(head, 4)

        assertThat(root?.`val`, `is`(2))
        assertThat(root?.next?.`val`, `is`(0))
        assertThat(root?.next?.next?.`val`, `is`(1))
        assertThat(root?.next?.next?.next, nullValue())
    }

}
