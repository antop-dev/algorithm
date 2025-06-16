package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3101Test {
    val sut = P3101()

    @Test
    fun `example 1`() {
        assertThat(sut.countAlternatingSubarrays(intArrayOf(0, 1, 1, 1)), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countAlternatingSubarrays(intArrayOf(1, 0, 1, 0)), `is`(10))
    }
}