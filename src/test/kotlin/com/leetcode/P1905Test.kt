package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1905Test {
    val sut = P1905()

    @Test
    fun `example 1`() {
        val grid1 = arrayOf(
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(0, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 1, 1),
        )
        val grid2 = arrayOf(
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(0, 0, 1, 1, 1),
            intArrayOf(0, 1, 0, 0, 0),
            intArrayOf(1, 0, 1, 1, 0),
            intArrayOf(0, 1, 0, 1, 0),
        )
        assertThat(sut.countSubIslands(grid1, grid2), `is`(3))
    }

    @Test
    fun `example 2`() {
        val grid1 = arrayOf(
            intArrayOf(1, 0, 1, 0, 1),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 0, 1, 0, 1),
        )
        val grid2 = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(0, 1, 0, 1, 0),
            intArrayOf(1, 0, 0, 0, 1),
        )
        assertThat(sut.countSubIslands(grid1, grid2), `is`(2))
    }
}