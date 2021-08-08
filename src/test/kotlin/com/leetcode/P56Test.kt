package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P56Test {
    val p = P56()

    @Test
    fun `example 01`() {
        assertThat(
            p.merge(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 6),
                    intArrayOf(8, 10),
                    intArrayOf(15, 18)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(1, 6),
                    intArrayOf(8, 10),
                    intArrayOf(15, 18)
                )
            )
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.merge(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(4, 5)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(1, 5)
                )
            )
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.merge(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(0, 4)
                )
            ),
            `is`(
                arrayOf(
                    intArrayOf(0, 4)
                )
            )
        )
    }
}
