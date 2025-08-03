package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1020Test {
    val sut = P1020()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 0, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0)
        )
        assertThat(sut.numEnclaves(grid), `is`(3))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0)
        )
        assertThat(sut.numEnclaves(grid), `is`(0))
    }

}