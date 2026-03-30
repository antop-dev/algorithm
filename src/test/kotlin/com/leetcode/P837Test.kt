package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.closeTo
import org.junit.jupiter.api.Test

class P837Test {
    private val sut = P837()
    private val error = 1e-5

    @Test
    fun `example 1`() {
        assertThat(sut.new21Game(10, 1, 10), closeTo(1.00000, error))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.new21Game(6, 1, 10), closeTo(0.60000, error))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.new21Game(21, 17, 10), closeTo(0.73278, error))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.new21Game(421, 400, 47), closeTo(0.71188, error))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.new21Game(5710, 5070, 8516), closeTo(0.13649, error))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.new21Game(10_000, 10_000, 10_000), closeTo(0.00027, error))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.new21Game(15, 5, 3), closeTo(1.0, error))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.new21Game(10, 2, 10), closeTo(0.99, error))
    }
}
