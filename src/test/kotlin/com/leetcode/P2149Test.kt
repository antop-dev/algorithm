package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2149Test {
    val sut = P2149()

    @Test
    fun `example 1`() {
        assertThat(
            sut.rearrangeArray(intArrayOf(3, 1, -2, -5, 2, -4)),
            `is`(intArrayOf(3, -2, 1, -5, 2, -4))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.rearrangeArray(intArrayOf(-1, 1)),
            `is`(intArrayOf(1, -1))
        )
    }
}