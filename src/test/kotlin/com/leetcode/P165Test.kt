package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P165Test {
    val sut = P165()

    @Test
    fun `example 01`() {
        assertThat(sut.compareVersion("1.01", "1.001"), `is`(0))
    }

    @Test
    fun `example 02`() {
        assertThat(sut.compareVersion("1.0", "1.0.0"), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(sut.compareVersion("0.1", "1.1"), `is`(-1))
    }

    @Test
    fun `example 04`() {
        assertThat(sut.compareVersion("7.5.2.4", "7.5.3"), `is`(-1))
    }


}
