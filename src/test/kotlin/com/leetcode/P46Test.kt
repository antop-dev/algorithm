package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P46Test {
    val p = P46()

    @Test
    fun `example 01`() {
        assertThat(
            p.permute(intArrayOf(1, 2, 3)), containsInAnyOrder(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 1, 2),
                listOf(3, 2, 1)
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.permute(intArrayOf(0, 1)), containsInAnyOrder(
                listOf(0, 1),
                listOf(1, 0)
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.permute(intArrayOf(1)), containsInAnyOrder(
                listOf(1)
            )
        )
    }

}
