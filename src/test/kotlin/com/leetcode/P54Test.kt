package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P54Test {
    val sut = P54()

    @Test
    fun `example 1`() {
        assertThat(
            sut.spiralOrder(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                )
            ), `is`(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.spiralOrder(
                arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(5, 6, 7, 8),
                    intArrayOf(9, 10, 11, 12)
                )
            ), `is`(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.spiralOrder(
                arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(5, 6, 7, 8),
                    intArrayOf(9, 10, 11, 12),
                    intArrayOf(13, 14, 15, 16)
                )
            ), `is`(listOf(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10))
        )
    }
}
