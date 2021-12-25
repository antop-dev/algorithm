package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P452Test {
    val p = P452()

    @Test
    fun `example 01`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(10, 16),
                    intArrayOf(2, 8),
                    intArrayOf(1, 6),
                    intArrayOf(7, 12)
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                    intArrayOf(5, 6),
                    intArrayOf(7, 8)
                )
            ), `is`(4)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5)
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(3, 9),
                    intArrayOf(7, 12),
                    intArrayOf(3, 8),
                    intArrayOf(6, 8),
                    intArrayOf(9, 10),
                    intArrayOf(2, 9),
                    intArrayOf(0, 9),
                    intArrayOf(3, 9),
                    intArrayOf(0, 6),
                    intArrayOf(2, 8)
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 05`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(3, 9),
                    intArrayOf(7, 12),
                    intArrayOf(3, 8),
                    intArrayOf(6, 8),
                    intArrayOf(9, 10),
                    intArrayOf(2, 9),
                    intArrayOf(0, 9),
                    intArrayOf(3, 9),
                    intArrayOf(0, 6),
                    intArrayOf(2, 8)
                )
            ), `is`(2)
        )
    }

    @Test
    fun `example 06`() {
        assertThat(
            p.findMinArrowShots(
                arrayOf(
                    intArrayOf(-2147483646, -2147483645),
                    intArrayOf(2147483646, 2147483647)
                )
            ), `is`(2)
        )
    }
}
