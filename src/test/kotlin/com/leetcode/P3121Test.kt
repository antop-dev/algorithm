package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3121Test {
    private val sut = P3121()

    @Test
    fun `example 1`() {
        assertThat(sut.numberOfSpecialChars("aaAbcBC"), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numberOfSpecialChars("abc"), `is`(0))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numberOfSpecialChars("AbBCab"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.numberOfSpecialChars("cCceDC"), `is`(0))
    }
}
