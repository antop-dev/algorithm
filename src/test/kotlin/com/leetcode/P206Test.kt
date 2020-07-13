package com.leetcode

import com.leetcode.P206.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P206Test {
    val p = P206()

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
        val reversed = p.reverseList(head)

        assertThat(reversed?.`val`, `is`(5))
        assertThat(reversed?.next?.`val`, `is`(4))
        assertThat(reversed?.next?.next?.`val`, `is`(3))
        assertThat(reversed?.next?.next?.next?.`val`, `is`(2))
        assertThat(reversed?.next?.next?.next?.next?.`val`, `is`(1))
        assertThat(reversed?.next?.next?.next?.next?.next, Matchers.nullValue())
    }
}
