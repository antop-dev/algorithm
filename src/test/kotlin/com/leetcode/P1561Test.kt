package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1561Test {
    val sut = P1561()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maxCoins(intArrayOf(2, 4, 1, 2, 7, 8)),
            `is`(9)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.maxCoins(intArrayOf(2, 4, 5)),
            `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maxCoins(intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)),
            `is`(18)
        )
    }
}