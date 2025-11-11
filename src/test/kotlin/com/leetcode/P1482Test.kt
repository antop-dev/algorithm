package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1482Test {
    val sut = P1482()

    @Test
    fun `example 1`() {
        assertThat(
            sut.minDays(intArrayOf(1, 10, 3, 10, 2), 3, 1),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.minDays(intArrayOf(1, 10, 3, 10, 2), 3, 2),
            `is`(-1)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.minDays(intArrayOf(7, 7, 7, 7, 12, 7, 7), 2, 3),
            `is`(12)
        )
    }

}