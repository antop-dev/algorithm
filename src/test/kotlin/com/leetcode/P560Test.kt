package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P560Test {
    private val sut = P560()

    @Test
    fun `example 01`() {
        assertThat(sut.subarraySum(intArrayOf(1, 1, 1), 2), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.subarraySum(intArrayOf(1, 2, 3), 3), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.subarraySum(intArrayOf(1), 1), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.subarraySum(intArrayOf(2, 4, 7, 2, -3, 1, 4, 2), 7), `is`(3))
    }

}
