package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P453Test {
    val sut = P453()

    @Test
    fun `example 1`() {
        assertThat(sut.minMoves(intArrayOf(1, 2, 3)), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.minMoves(intArrayOf(1, 1, 1)), `is`(0))
    }

}
