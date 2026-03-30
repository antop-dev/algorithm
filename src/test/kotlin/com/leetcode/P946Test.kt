package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P946Test {
    private val sut = P946()

    @Test
    fun `example 1`() {
        val pushed = intArrayOf(1, 2, 3, 4, 5)
        val popped = intArrayOf(4, 5, 3, 2, 1)
        assertThat(sut.validateStackSequences(pushed, popped), `is`(true))
    }

    @Test
    fun `example 2`() {
        val pushed = intArrayOf(1, 2, 3, 4, 5)
        val popped = intArrayOf(4, 3, 5, 1, 2)
        assertThat(sut.validateStackSequences(pushed, popped), `is`(false))
    }
}
