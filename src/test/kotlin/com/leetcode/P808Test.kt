package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.closeTo
import org.junit.jupiter.api.Test

class P808Test {
    val sut = P808()
    val error = 1e-5 // 오차 범위

    @Test
    fun `example 1`() {
        assertThat(sut.soupServings(50), closeTo(0.625, error))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.soupServings(100), closeTo(0.71875, error))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.soupServings(850), closeTo(0.96612, error))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.soupServings(1_000_000_000), closeTo(1.0, error))
    }
}
