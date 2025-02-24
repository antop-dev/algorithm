package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P670Test {
    val sut = P670()

    @Test
    fun `example 1`() {
        assertThat(sut.maximumSwap(2736), `is`(7236))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maximumSwap(9973), `is`(9973))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maximumSwap(12345), `is`(52341))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.maximumSwap(9991234), `is`(9994231))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.maximumSwap(9981234), `is`(9984231))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.maximumSwap(9981294), `is`(9991284))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.maximumSwap(9904321), `is`(9940321))
    }

    @Test
    fun `example 8`() {
        assertThat(sut.maximumSwap(1), `is`(1))
    }

    @Test
    fun `example 9`() {
        assertThat(sut.maximumSwap(9999989), `is`(9999998))
    }

    @Test
    fun `example 10`() {
        assertThat(sut.maximumSwap(0), `is`(0))
    }
}
