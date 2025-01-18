package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P885Test {
    val sut = P885()

    @Test
    fun `example 1`() {
        assertThat(
            sut.spiralMatrixIII(1, 4, 0, 0),
            `is`(
                arrayOf(
                    intArrayOf(0, 0),
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(0, 3),
                )
            )
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.spiralMatrixIII(5, 6, 1, 4),
            `is`(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(1, 5),
                    intArrayOf(2, 5),
                    intArrayOf(2, 4),
                    intArrayOf(2, 3),
                    intArrayOf(1, 3),
                    intArrayOf(0, 3),
                    intArrayOf(0, 4),
                    intArrayOf(0, 5),
                    intArrayOf(3, 5),
                    intArrayOf(3, 4),
                    intArrayOf(3, 3),
                    intArrayOf(3, 2),
                    intArrayOf(2, 2),
                    intArrayOf(1, 2),
                    intArrayOf(0, 2),
                    intArrayOf(4, 5),
                    intArrayOf(4, 4),
                    intArrayOf(4, 3),
                    intArrayOf(4, 2),
                    intArrayOf(4, 1),
                    intArrayOf(3, 1),
                    intArrayOf(2, 1),
                    intArrayOf(1, 1),
                    intArrayOf(0, 1),
                    intArrayOf(4, 0),
                    intArrayOf(3, 0),
                    intArrayOf(2, 0),
                    intArrayOf(1, 0),
                    intArrayOf(0, 0),
                )
            )
        )
    }
}
