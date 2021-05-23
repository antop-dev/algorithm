package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P78Test {
    val p = P78()

    @Test
    fun `example 01`() {
        assertThat(
            p.subsets(intArrayOf(1, 2, 3)), containsInAnyOrder(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(1, 2),
                listOf(3),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3)
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.subsets(intArrayOf(0)), containsInAnyOrder(
                listOf(),
                listOf(0)
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.subsets(intArrayOf(1, 2, 3, 4, 5)), containsInAnyOrder(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(1, 2),
                listOf(3),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3),
                listOf(4),
                listOf(1, 4),
                listOf(2, 4),
                listOf(1, 2, 4),
                listOf(3, 4),
                listOf(1, 3, 4),
                listOf(2, 3, 4),
                listOf(1, 2, 3, 4),
                listOf(5),
                listOf(1, 5),
                listOf(2, 5),
                listOf(1, 2, 5),
                listOf(3, 5),
                listOf(1, 3, 5),
                listOf(2, 3, 5),
                listOf(1, 2, 3, 5),
                listOf(4, 5),
                listOf(1, 4, 5),
                listOf(2, 4, 5),
                listOf(1, 2, 4, 5),
                listOf(3, 4, 5),
                listOf(1, 3, 4, 5),
                listOf(2, 3, 4, 5),
                listOf(1, 2, 3, 4, 5)
            )
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.subsets(intArrayOf(1, 2, 3, 4, 5)), containsInAnyOrder(
                listOf(),
                listOf(1),
                listOf(2),
                listOf(1, 2),
                listOf(3),
                listOf(1, 3),
                listOf(2, 3),
                listOf(1, 2, 3),
                listOf(4),
                listOf(1, 4),
                listOf(2, 4),
                listOf(1, 2, 4),
                listOf(3, 4),
                listOf(1, 3, 4),
                listOf(2, 3, 4),
                listOf(1, 2, 3, 4),
                listOf(5),
                listOf(1, 5),
                listOf(2, 5),
                listOf(1, 2, 5),
                listOf(3, 5),
                listOf(1, 3, 5),
                listOf(2, 3, 5),
                listOf(1, 2, 3, 5),
                listOf(4, 5),
                listOf(1, 4, 5),
                listOf(2, 4, 5),
                listOf(1, 2, 4, 5),
                listOf(3, 4, 5),
                listOf(1, 3, 4, 5),
                listOf(2, 3, 4, 5),
                listOf(1, 2, 3, 4, 5)
            )
        )
    }
}
