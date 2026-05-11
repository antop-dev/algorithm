package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3868Test {
    private val sut = P3868()

    @Test
    fun `example 1`() {
        assertThat(sut.minCost(intArrayOf(10, 20), intArrayOf(20, 10)), `is`(0))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minCost(intArrayOf(10, 10), intArrayOf(20, 20)), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.minCost(intArrayOf(10, 20), intArrayOf(30, 40)), `is`(-1))
    }
}
