package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3111Test {
    val sut = P3111()

    @Test
    fun `example 1`() {
        val points = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 0),
            intArrayOf(1, 4),
            intArrayOf(1, 8),
            intArrayOf(3, 5),
            intArrayOf(4, 6)
        )
        assertThat(sut.minRectanglesToCoverPoints(points, 1), `is`(2))
    }

    @Test
    fun `example 2`() {
        val points = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 3),
            intArrayOf(4, 4),
            intArrayOf(5, 5),
            intArrayOf(6, 6)
        )
        assertThat(sut.minRectanglesToCoverPoints(points, 2), `is`(3))
    }

    @Test
    fun `example 3`() {
        val points = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 2)
        )
        assertThat(sut.minRectanglesToCoverPoints(points, 0), `is`(2))
    }

}
