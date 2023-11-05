package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2125Test {
    val sut = P2125()

    @Test
    fun `example 01`() {
        assertThat(
            sut.numberOfBeams(
                arrayOf(
                    "011001",
                    "000000",
                    "010100",
                    "001000"
                )
            ),
            `is`(8)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.numberOfBeams(
                arrayOf(
                    "000",
                    "111",
                    "000"
                )
            ),
            `is`(0)
        )
    }
}
