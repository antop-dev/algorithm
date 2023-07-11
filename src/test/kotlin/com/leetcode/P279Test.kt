package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P279Test {
    val sut = P279()

    @Test
    fun `example 1`() {
        assertThat(sut.numSquares(12), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.numSquares(13), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.numSquares(1), `is`(1))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.numSquares(55), `is`(4))
    }

}
