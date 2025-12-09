package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P930Test {
    val sut = P930()

    @Test
    fun `example 1`() {
        assertThat(
            sut.numSubarraysWithSum(intArrayOf(1, 0, 1, 0, 1), 2),
            `is`(4)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.numSubarraysWithSum(intArrayOf(0, 0, 0, 0, 0), 0),
            `is`(15)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.numSubarraysWithSum(intArrayOf(1, 1, 1, 1, 1), 5),
            `is`(1)
        )
    }

}