package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P861Test {
    val sut = P861()

    @Test
    fun `example 1`() {
        val grid = arrayOf(
            intArrayOf(0, 0, 1, 1),
            intArrayOf(1, 0, 1, 0),
            intArrayOf(1, 1, 0, 0),
        )
        assertThat(sut.matrixScore(grid), `is`(39))
    }

    @Test
    fun `example 2`() {
        val grid = arrayOf(
            intArrayOf(0),
        )
        assertThat(sut.matrixScore(grid), `is`(1))
    }
}
