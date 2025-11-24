package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1605Test {
    val sut = P1605()

    @Test
    fun `example 1`() {
        val rowSum = intArrayOf(3, 8)
        val colSum = intArrayOf(4, 7)
        val output = arrayOf(
            intArrayOf(3, 0),
            intArrayOf(1, 7)
        )
        assertThat(sut.restoreMatrix(rowSum, colSum), `is`(output))
    }

    @Test
    fun `example 2`() {
        val rowSum = intArrayOf(5, 7, 10)
        val colSum = intArrayOf(8, 6, 8)
        val output = arrayOf(
            intArrayOf(5, 0, 0),
            intArrayOf(3, 4, 0),
            intArrayOf(0, 2, 8),
        )
        assertThat(sut.restoreMatrix(rowSum, colSum), `is`(output))
    }
}