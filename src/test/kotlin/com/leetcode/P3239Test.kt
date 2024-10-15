package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3239Test {
    val sut = P3239()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 1),
        )
        assertThat(sut.minFlips(grid), `is`(2))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 1),
            intArrayOf(0, 0),
        )
        assertThat(sut.minFlips(grid), `is`(1))
    }

    @Test
    fun `example 3`() {
        val grid = arrayOf(
            intArrayOf(1),
            intArrayOf(0),
        )
        assertThat(sut.minFlips(grid), `is`(0))
    }
}
