package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1043Test {
    private val sut = P1043()

    @Test
    fun `example 01`() {
        assertThat(
            sut.maxSumAfterPartitioning(intArrayOf(1, 15, 7, 9, 2, 5, 10), 3),
            `is`(84)
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            sut.maxSumAfterPartitioning(intArrayOf(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3), 4),
            `is`(83)
        )
    }

    @Test
    fun `example 03`() {
        assertThat(sut.maxSumAfterPartitioning(intArrayOf(1), 1), `is`(1))
    }

}
