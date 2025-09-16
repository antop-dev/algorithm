package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P743Test {
    val sut = P743()

    @Test
    fun `example 1`() {
        assertThat(
            sut.networkDelayTime(
                times = arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(2, 3, 1),
                    intArrayOf(3, 4, 1)
                ),
                n = 4,
                k = 2,
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.networkDelayTime(
                times = arrayOf(
                    intArrayOf(1, 2, 1),
                ),
                n = 2,
                k = 1,
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.networkDelayTime(
                times = arrayOf(
                    intArrayOf(1, 2, 1),
                ),
                n = 2,
                k = 2,
            ),
            `is`(-1)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.networkDelayTime(
                times = arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(2, 3, 2),
                    intArrayOf(1, 3, 2)
                ),
                n = 3,
                k = 1,
            ),
            `is`(2)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.networkDelayTime(
                times = arrayOf(
                    intArrayOf(1, 2, 1),
                    intArrayOf(2, 1, 3),
                ),
                n = 2,
                k = 2,
            ),
            `is`(3)
        )
    }
}