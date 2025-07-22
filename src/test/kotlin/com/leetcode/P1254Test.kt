package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1254Test {
    val sut = P1254()

    @Test
    fun `example 1`() {
        assertThat(sut.findTheWinner(5, 2), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findTheWinner(6, 5), `is`(1))
    }
}