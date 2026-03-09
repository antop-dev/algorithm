package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1895Test {
    val sut = P1895()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(7, 1, 4, 5, 6),
            intArrayOf(2, 5, 1, 6, 4),
            intArrayOf(1, 5, 4, 3, 2),
            intArrayOf(1, 2, 7, 3, 4)
        )
        assertThat(sut.largestMagicSquare(grid), `is`(3))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(5, 1, 3, 1),
            intArrayOf(9, 3, 3, 1),
            intArrayOf(1, 3, 3, 8)
        )
        assertThat(sut.largestMagicSquare(grid), `is`(2))
    }

}
