package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2749Test {
    val sut = P2749()

    @Test
    fun `example 1`() {
        assertThat(sut.makeTheIntegerZero(3, -2), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.makeTheIntegerZero(5, 7), `is`(-1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.makeTheIntegerZero(1, 1), `is`(-1))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.makeTheIntegerZero(300, 10), `is`(4))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.makeTheIntegerZero(1, 2), `is`(-1))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.makeTheIntegerZero(2, 1), `is`(1))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.makeTheIntegerZero(3, 1), `is`(1))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.makeTheIntegerZero(999999999, -999999999), `is`(17))
    }
}