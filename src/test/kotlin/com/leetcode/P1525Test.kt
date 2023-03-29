package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1525Test {
    val sut = P1525()

    @Test
    fun `example 1`() {
        assertThat(sut.numSplits("aacaba"), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numSplits("abcd"), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numSplits("a"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.numSplits("aa"), `is`(1))
    }
}
