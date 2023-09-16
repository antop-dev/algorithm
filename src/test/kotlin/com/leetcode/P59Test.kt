package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P59Test {
    val sut = P59()

    @Test
    fun `example 1`() {
        assertThat(
            sut.generateMatrix(3), `is`(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(8, 9, 4),
                    intArrayOf(7, 6, 5)
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.generateMatrix(1), `is`(
                arrayOf(
                    intArrayOf(1)
                )
            )
        )
    }
}
