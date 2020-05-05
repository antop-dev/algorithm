package com.leetcode

import com.leetcode.P83.ListNode
import org.hamcrest.Description
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.TypeSafeDiagnosingMatcher
import org.junit.jupiter.api.Test

internal class P83Test {
    val p = P83()

    @Test
    fun `example 1`() {
        val head = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2)
            }
        }

        val expected = ListNode(1).apply {
            next = ListNode(2)
        }

        assertThat(p.deleteDuplicates(head), IsEquals.equals(expected));
    }

    @Test
    fun `example 2`() {
        val head = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(3)
                    }
                }
            }
        }

        val expected = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        assertThat(p.deleteDuplicates(head), IsEquals.equals(expected));
    }

    /**
     * ListNode 비교
     */
    class IsEquals(private val expected: ListNode?) : TypeSafeDiagnosingMatcher<ListNode>() {

        override fun matchesSafely(actual: ListNode?, description: Description?): Boolean {
            val x = toString(actual)
            val y = toString(expected)
            return if (x == y) true else {
                description?.appendText(x)
                false
            }
        }

        override fun describeTo(description: Description?) {
            description?.appendValue(toString(expected))
        }

        private fun toString(list: ListNode?): String {
            var s = "${list?.`val`}"
            var next = list?.next
            while (next != null) {
                s += "->${next.`val`}"
                next = next.next
            }
            return s
        }

        companion object {
            fun equals(expected: ListNode?): IsEquals {
                return IsEquals(expected)
            }
        }

    }
}