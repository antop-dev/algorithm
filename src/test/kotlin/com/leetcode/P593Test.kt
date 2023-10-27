package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P593Test {
    val sut = P593()

    @Test
    fun `example 1`() {
        assertThat(
            sut.validSquare(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
                intArrayOf(1, 0),
                intArrayOf(0, 1)
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.validSquare(
                intArrayOf(0, 0),
                intArrayOf(1, 1),
                intArrayOf(1, 0),
                intArrayOf(0, 12)
            ),
            `is`(false)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.validSquare(
                intArrayOf(1, 0),
                intArrayOf(-1, 0),
                intArrayOf(0, 1),
                intArrayOf(0, -1)
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.validSquare(
                intArrayOf(6987, -473),
                intArrayOf(6985, -473),
                intArrayOf(6986, -472),
                intArrayOf(6986, -474)
            ),
            `is`(true)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.validSquare(
                intArrayOf(0, 0),
                intArrayOf(-1, 0),
                intArrayOf(1, 0),
                intArrayOf(0, 1)
            ),
            `is`(false)
        )
    }

}
