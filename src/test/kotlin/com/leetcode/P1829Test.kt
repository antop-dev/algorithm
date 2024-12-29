package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1829Test {
    val sut = P1829()

    @Test
    fun `example 1`() {
        assertThat(sut.getMaximumXor(intArrayOf(0, 1, 1, 3), 2), `is`(intArrayOf(0, 3, 2, 3)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.getMaximumXor(intArrayOf(2, 3, 4, 7), 3), `is`(intArrayOf(5, 2, 6, 5)))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.getMaximumXor(intArrayOf(0, 1, 2, 2, 5, 7), 3), `is`(intArrayOf(4, 3, 6, 4, 6, 7)))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.getMaximumXor(intArrayOf(0, 1, 1, 3), 2), `is`(intArrayOf(0, 3, 2, 3)))
    }
}
