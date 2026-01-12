package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P918Test {
    val sut = P918()

    @Test
    fun `example 1`() {
        assertThat(sut.maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxSubarraySumCircular(intArrayOf(5, -3, 5)), `is`(10))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxSubarraySumCircular(intArrayOf(-3, -2, -3)), `is`(-2))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.maxSubarraySumCircular(intArrayOf(-2, 4, -5, -4, -5, 9, 4)), `is`(15))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.maxSubarraySumCircular(intArrayOf(-6, -9, -1)), `is`(-1))
    }
}
