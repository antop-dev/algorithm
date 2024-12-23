package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2120Test {
    val sut = P2120()

    @Test
    fun `example 1`() {
        assertThat(
            sut.executeInstructions(3, intArrayOf(0, 1), "RRDDLU"),
            `is`(intArrayOf(1, 5, 4, 3, 1, 0))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.executeInstructions(2, intArrayOf(1, 1), "LURD"),
            `is`(intArrayOf(4, 1, 0, 0))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.executeInstructions(1, intArrayOf(0, 0), "LRUD"),
            `is`(intArrayOf(0, 0, 0, 0))
        )
    }
}
