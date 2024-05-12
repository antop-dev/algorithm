package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2433Test {
    val sut = P2433()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findArray(intArrayOf(5, 2, 0, 3, 1)),
            `is`(intArrayOf(5, 7, 2, 3, 2))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findArray(intArrayOf(13)),
            `is`(intArrayOf(13))
        )
    }
}
