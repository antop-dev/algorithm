package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class P1351Test {
    val p = P1351()

    @Test
    fun `example 01`() {
        assertThat(
            p.countNegatives(
                arrayOf(
                    intArrayOf(4, 3, 2, -1),
                    intArrayOf(3, 2, 1, -1),
                    intArrayOf(1, 1, -1, -2),
                    intArrayOf(-1, -1, -2, -3)
                )
            ), `is`(8)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.countNegatives(
                arrayOf(
                    intArrayOf(3, 2),
                    intArrayOf(1, 0)
                )
            ), `is`(0)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.countNegatives(
                arrayOf(
                    intArrayOf(1, -1),
                    intArrayOf(-1, -1)
                )
            ), `is`(3)
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.countNegatives(
                arrayOf(
                    intArrayOf(-1)
                )
            ), `is`(1)
        )
    }

}
