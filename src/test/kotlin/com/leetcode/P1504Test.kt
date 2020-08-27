package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1504Test {
    val p = P1504()

    @Test
    fun `example 01`() {
        assertThat(
            p.numSubmat(
                arrayOf(
                    intArrayOf(1, 0, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0)
                )
            ), `is`(13)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.numSubmat(
                arrayOf(
                    intArrayOf(0, 1, 1, 0),
                    intArrayOf(0, 1, 1, 1),
                    intArrayOf(1, 1, 1, 0)
                )
            ), `is`(24)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.numSubmat(
                arrayOf(
                    intArrayOf(1, 1, 1, 1, 1, 1)
                )
            ), `is`(21)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.numSubmat(
                arrayOf(
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 1, 0),
                    intArrayOf(1, 0, 1)
                )
            ), `is`(5)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.numSubmat(
                arrayOf(
                    intArrayOf(1, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 0, 1)
                )
            ), `is`(16)
        )
    }
}
