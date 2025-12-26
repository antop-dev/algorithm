package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2799Test {
    val sut = P2799()

    @Test
    fun `example 1`() {
        assertThat(sut.countCompleteSubarrays(intArrayOf(1, 3, 1, 2, 2)), `is`(4))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countCompleteSubarrays(intArrayOf(5, 5, 5, 5)), `is`(10))
    }
}