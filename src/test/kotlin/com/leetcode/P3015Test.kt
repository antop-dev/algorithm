package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3015Test {
    val sut = P3015()

    @Test
    fun `example 1`() {
        assertThat(sut.countOfPairs(3, 1, 3), `is`(intArrayOf(6, 0, 0)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.countOfPairs(5, 2, 4), `is`(intArrayOf(10, 8, 2, 0, 0)))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.countOfPairs(4, 1, 1), `is`(intArrayOf(6, 4, 2, 0)))
    }
}
