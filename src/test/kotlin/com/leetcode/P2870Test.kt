package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2870Test {
    val sut = P2870()

    @Test
    fun `example 1`() {
        assertThat(sut.minOperations(intArrayOf(2, 3, 3, 2, 2, 4, 2, 3, 4)), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minOperations(intArrayOf(2, 1, 2, 2, 3, 3)), `is`(-1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minOperations(intArrayOf(1, 1, 1, 1, 1, 1, 1)), `is`(3))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.minOperations(intArrayOf(1, 1, 1, 1, 1, 1)), `is`(2))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.minOperations(intArrayOf(1, 1, 1, 1, 1)), `is`(2))
    }

    @Test
    fun `example 6`() {
        assertThat(
            sut.minOperations(
                intArrayOf(
                    14,
                    12,
                    14,
                    14,
                    12,
                    14,
                    14,
                    12,
                    12,
                    12,
                    12,
                    14,
                    14,
                    12,
                    14,
                    14,
                    14,
                    12,
                    12
                )
            ), `is`(7)
        )
    }
}
