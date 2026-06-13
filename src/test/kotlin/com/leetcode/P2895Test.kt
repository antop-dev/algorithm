package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2895Test {
    val sut = P2895()

    @Test
    fun `example 1`() {
        val processorTime = listOf(8, 10)
        val tasks = listOf(2, 2, 3, 1, 8, 7, 4, 5)
        assertThat(sut.minProcessingTime(processorTime, tasks), `is`(16))
    }

    @Test
    fun `example 2`() {
        val processorTime = listOf(10, 20)
        val tasks = listOf(2, 3, 1, 2, 5, 8, 4, 3)
        assertThat(sut.minProcessingTime(processorTime, tasks), `is`(23))
    }
}
