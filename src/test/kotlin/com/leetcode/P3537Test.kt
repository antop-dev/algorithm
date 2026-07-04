package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3537Test {
    private val sut = P3537()

    @Test
    fun `example 1`() {
        val n = 0
        val grid = arrayOf(intArrayOf(0))
        assertThat(sut.specialGrid(n), `is`(grid))
    }

    @Test
    fun `example 2`() {
        val n = 1
        val grid = arrayOf(
            intArrayOf(3, 0),
            intArrayOf(2, 1),
        )
        assertThat(sut.specialGrid(n), `is`(grid))
    }

    @Test
    fun `example 3`() {
        val n = 2
        val grid = arrayOf(
            intArrayOf(15, 12, 3, 0),
            intArrayOf(14, 13, 2, 1),
            intArrayOf(11, 8, 7, 4),
            intArrayOf(10, 9, 6, 5),
        )
        assertThat(sut.specialGrid(n), `is`(grid))
    }

    @Test
    fun `example 4`() {
        val n = 3
        val grid = arrayOf(
            intArrayOf(63, 60, 51, 48, 15, 12, 3, 0),
            intArrayOf(62, 61, 50, 49, 14, 13, 2, 1),
            intArrayOf(59, 56, 55, 52, 11, 8, 7, 4),
            intArrayOf(58, 57, 54, 53, 10, 9, 6, 5),
            intArrayOf(47, 44, 35, 32, 31, 28, 19, 16),
            intArrayOf(46, 45, 34, 33, 30, 29, 18, 17),
            intArrayOf(43, 40, 39, 36, 27, 24, 23, 20),
            intArrayOf(42, 41, 38, 37, 26, 25, 22, 21),
        )
        assertThat(sut.specialGrid(n), `is`(grid))
    }
}
