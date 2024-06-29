package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2740Test {
    val sut = P2740()

    @Test
    fun `example 1`() {
        assertThat(sut.findValueOfPartition(intArrayOf(1, 3, 2, 4)), `is`(1))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findValueOfPartition(intArrayOf(100, 1, 10)), `is`(9))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.findValueOfPartition(intArrayOf(1, 1_000_000_000)), `is`(9))
    }

}
