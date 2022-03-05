package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P120Test {
    val p = P120()

    @Test
    fun `example 01`() {
        assertThat(
            p.minimumTotal(
                listOf(
                    listOf(2),
                    listOf(3, 4),
                    listOf(6, 5, 7),
                    listOf(4, 1, 8, 3)
                )
            ), `is`(11)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.minimumTotal(
                listOf(
                    listOf(-1),
                    listOf(2, 3),
                    listOf(1, -1, -3)
                )
            ), `is`(-1)
        )
    }
}
