package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P289Test {
    val sut = P289()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0)
        )
        sut.gameOfLife(grid)
        assertThat(
            grid,
            `is`(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(0, 1, 0)
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 0)
        )
        sut.gameOfLife(grid)
        assertThat(
            grid,
            `is`(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            )
        )
    }
}
