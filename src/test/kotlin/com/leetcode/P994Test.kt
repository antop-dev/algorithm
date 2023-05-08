package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P994Test {
    val sut = P994()

    @Test
    fun `example 1`() {
        assertThat(
            sut.orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 1)
                )
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            ),
            `is`(-1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.orangesRotting(
                arrayOf(
                    intArrayOf(0, 2)
                )
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.orangesRotting(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 0),
                    intArrayOf(0, 0, 0)
                )
            ),
            `is`(0)
        )
    }
}
