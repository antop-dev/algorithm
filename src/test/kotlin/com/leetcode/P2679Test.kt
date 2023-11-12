package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2679Test {
    val sut = P2679()

    @Test
    fun `example 1`() {
        assertThat(
            sut.matrixSum(
                arrayOf(
                    intArrayOf(7, 2, 1),
                    intArrayOf(6, 4, 2),
                    intArrayOf(6, 5, 3),
                    intArrayOf(3, 2, 1)
                )
            ), `is`(15)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.matrixSum(
                arrayOf(
                    intArrayOf(1)
                )
            ), `is`(1)
        )
    }
}
