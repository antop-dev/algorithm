package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2294Test {
    private val sut = P2294()

    @Test
    fun `example 1`() {
        assertThat(sut.partitionArray(intArrayOf(3, 6, 1, 2, 5), 2), `is`(2))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.partitionArray(intArrayOf(1, 2, 3), 1), `is`(2))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.partitionArray(intArrayOf(2, 2, 4, 5), 0), `is`(3))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.partitionArray(intArrayOf(16, 8, 17, 0, 3, 17, 8, 20), 10), `is`(2))
    }
}
