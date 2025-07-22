package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1823Test {
    val sut = P1823()

    @Test
    fun `example 1`() {
        assertThat(sut.findTheWinner(5, 2), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findTheWinner(6, 5), `is`(1))
    }
}