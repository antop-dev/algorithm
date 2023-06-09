package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P91Test {
    val sut = P91()

    @Test
    fun `example 1`() {
        assertThat(sut.numDecodings("12"), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numDecodings("226"), `is`(3))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numDecodings("06"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.numDecodings("26910131620212325"), `is`(80))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.numDecodings("2002"), `is`(0))
    }

    @Test
    fun `example 6`() {
        assertThat(sut.numDecodings("202010"), `is`(1))
    }

    @Test
    fun `example 7`() {
        assertThat(sut.numDecodings("2020010"), `is`(0))
    }
}
