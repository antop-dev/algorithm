package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P873Test {
    val sut = P873()

    @Test
    fun `example 1`() {
        assertThat(sut.lenLongestFibSubseq(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.lenLongestFibSubseq(intArrayOf(1, 3, 7, 11, 12, 14, 18)), `is`(3))
    }

}
