package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3619Test {
    val sut = P3619()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(0, 2, 1, 0, 0),
            intArrayOf(0, 5, 0, 0, 5),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 1, 4, 7, 0),
            intArrayOf(0, 2, 0, 0, 8),
        )
        assertThat(sut.countIslands(grid, 5), `is`(2))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(3, 0, 3, 0),
            intArrayOf(0, 3, 0, 3),
            intArrayOf(3, 0, 3, 0),
        )
        assertThat(sut.countIslands(grid, 3), `is`(6))
    }
}