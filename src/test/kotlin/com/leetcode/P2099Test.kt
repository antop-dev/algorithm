package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2099Test {
    val sut = P2099()

    @Test
    fun `example 01`() {
        assertThat(sut.maxSubsequence(intArrayOf(2, 1, 3, 3), 2), `is`(intArrayOf(3, 3)))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.maxSubsequence(intArrayOf(-1, -2, 3, 4), 3), `is`(intArrayOf(-1, 3, 4)))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.maxSubsequence(intArrayOf(3, 4, 3, 3), 2), `is`(intArrayOf(3, 4)))
    }

}
