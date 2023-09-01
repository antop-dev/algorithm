package com.leetcode

import com.leetcode.P237.ListNode
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.nullValue
import org.junit.jupiter.api.Test

class P237Test {
    val sut = P237()

    @Test
    fun `example 1`() {
        val node = ListNode(5).apply {
            next = ListNode(1).apply {
                next = ListNode(9)
            }
        }
        val head = ListNode(4).apply {
            next = node
        }

        print(head)

        sut.deleteNode(node)

        assertThat(head.`val`, `is`(4))
        assertThat(head.next?.`val`, `is`(1))
        assertThat(head.next?.next?.`val`, `is`(9))
        assertThat(head.next?.next?.next, nullValue())

        print(head)
    }

    @Test
    fun `example 2`() {
        val node = ListNode(1).apply {
            next = ListNode(9)
        }
        val head = ListNode(4).apply {
            next = ListNode(5).apply {
                next = node
            }
        }

        print(head)

        sut.deleteNode(node)

        assertThat(head.`val`, `is`(4))
        assertThat(head.next?.`val`, `is`(5))
        assertThat(head.next?.next?.`val`, `is`(9))
        assertThat(head.next?.next?.next, nullValue())

        print(head)
    }

    private fun print(head: ListNode?) {
        val sb = StringBuilder()
        var node = head
        while (node != null) {
            if (sb.length > 0) sb.append(" > ")
            sb.append(node.`val`)
            node = node.next
        }

        println(sb)
    }

}
