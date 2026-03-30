package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2491Test {
    private val sut = P2491()

    @Test
    fun `example 1`() {
        assertThat(sut.dividePlayers(intArrayOf(3, 2, 5, 1, 3, 4)), `is`(22L))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.dividePlayers(intArrayOf(3, 4)), `is`(12L))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.dividePlayers(intArrayOf(1, 1, 2, 3)), `is`(-1L))
    }
}
