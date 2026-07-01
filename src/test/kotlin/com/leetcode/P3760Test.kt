package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3760Test {
    private val sut = P3760()

    @Test
    fun `example 1`() {
        assertThat(sut.maxDistinct("abab"), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.maxDistinct("abcd"), `is`(4))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.maxDistinct("aaaa"), `is`(1))
    }
}
