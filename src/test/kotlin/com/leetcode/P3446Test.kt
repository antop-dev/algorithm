package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3446Test {
    private val sut = P3446()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(1, 7, 3),
            intArrayOf(9, 8, 2),
            intArrayOf(4, 5, 6),
        )
        assertThat(
            sut.sortMatrix(grid), `is`(
                arrayOf(
                    intArrayOf(8, 2, 3),
                    intArrayOf(9, 6, 7),
                    intArrayOf(4, 5, 1),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        assertThat(sut.sortMatrix(grid), `is`(arrayOf(intArrayOf(2, 1), intArrayOf(1, 0))))
    }

    @Test
    fun `example 3`() {
        val grid = arrayOf(intArrayOf(1))
        assertThat(sut.sortMatrix(grid), `is`(arrayOf(intArrayOf(1))))
    }

    @Test
    fun `example 4`() {
        val grid = arrayOf(
            intArrayOf(-1, -2, -3),
            intArrayOf(-3, -3, -2),
            intArrayOf(-4, -4, 0),
        )
        assertThat(
            sut.sortMatrix(grid), `is`(
                arrayOf(
                    intArrayOf(0, -2, -3),
                    intArrayOf(-3, -1, -2),
                    intArrayOf(-4, -4, -3),
                )
            )
        )
    }
}
