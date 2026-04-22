package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1727Test {
    private val sut = P1727()

    @Test
    fun `example 1`() {
        val matrix = arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1)
        )
        assertThat(sut.largestSubmatrix(matrix), `is`(4))
    }

    @Test
    fun `example 2`() {
        val matrix = arrayOf(
            intArrayOf(1, 0, 1, 0, 1)
        )
        assertThat(sut.largestSubmatrix(matrix), `is`(3))
    }

    @Test
    fun `example 3`() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 1)
        )
        assertThat(sut.largestSubmatrix(matrix), `is`(2))
    }
}
