package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P221Test {
    val sut = P221()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maximalSquare(
                arrayOf(
                    charArrayOf('1', '0', '1', '0', '0'),
                    charArrayOf('1', '0', '1', '1', '1'),
                    charArrayOf('1', '1', '1', '1', '1'),
                    charArrayOf('1', '0', '0', '1', '0')
                )
            ),
            `is`(4)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.maximalSquare(
                arrayOf(
                    charArrayOf('0', '0'),
                    charArrayOf('1', '0'),
                    charArrayOf('1', '1'),
                    charArrayOf('1', '0')
                )
            ),
            `is`(1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maximalSquare(
                arrayOf(
                    charArrayOf('0')
                )
            ),
            `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.maximalSquare(
                arrayOf(
                    charArrayOf('1', '1', '1', '1'),
                    charArrayOf('1', '1', '1', '1'),
                    charArrayOf('1', '1', '1', '1'),
                    charArrayOf('1', '1', '1', '1')
                )
            ),
            `is`(16)
        )
    }
}
