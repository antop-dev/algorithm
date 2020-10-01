package com.leetcode

import com.leetcode.P24.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P24Test {
    val p = P24()

    @Test
    fun swapPairs() {
        val head = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = p.swapPairs(head)

        assertThat(result?.`val`, `is`(2))
        assertThat(result?.next?.`val`, `is`(1))
        assertThat(result?.next?.next?.`val`, `is`(4))
        assertThat(result?.next?.next?.next?.`val`, `is`(3))
    }
}
