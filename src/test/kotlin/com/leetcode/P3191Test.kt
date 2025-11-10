package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3191Test {
    val sut = P3191()

    @Test
    fun `example 1`() {
        assertThat(
            sut.minOperations(intArrayOf(0, 1, 1, 1, 0, 0)),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.minOperations(intArrayOf(0, 1, 1, 1)),
            `is`(-1)
        )
    }

}