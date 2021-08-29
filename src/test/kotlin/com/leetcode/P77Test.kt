package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P77Test {
    val p = P77()

    @Test
    fun `example 01`() {
        assertThat(
            p.combine(n = 4, k = 2),
            `is`(
                listOf(
                    listOf(1, 2),
                    listOf(1, 3),
                    listOf(1, 4),
                    listOf(2, 3),
                    listOf(2, 4),
                    listOf(3, 4)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.combine(n = 1, k = 1),
            `is`(listOf(listOf(1)))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.combine(n = 4, k = 3),
            `is`(
                listOf(
                    listOf(1, 2, 3),
                    listOf(1, 2, 4),
                    listOf(1, 3, 4),
                    listOf(2, 3, 4)
                )
            )
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.combine(n = 4, k = 4),
            `is`(listOf(listOf(1, 2, 3, 4)))
        )
    }

}
