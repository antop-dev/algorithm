package com.leetcode

import com.leetcode.P141.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P141Test {
    val p = P141()

    @Test
    fun `example 01`() {
        val head = ListNode(3).apply {
            next = ListNode(2).apply cycle@{
                next = ListNode(0).apply {
                    next = ListNode(-4).apply { next = this@cycle }
                }
            }
        }

        assertThat(p.hasCycle(head), `is`(true))
    }

    @Test
    fun `example 02`() {
        val head = ListNode(1).apply cycle@{
            next = ListNode(2).apply {
                next = this@cycle
            }
        }

        assertThat(p.hasCycle(head), `is`(true))
    }

    @Test
    fun `example 03`() {
        val head = ListNode(1)

        assertThat(p.hasCycle(head), `is`(false))
    }
}
