package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1574Test {
    val sut = P1574()

    @Test
    fun `example 1`() {
        assertThat(
            sut.findLengthOfShortestSubarray(intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)),
            `is`(3)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.findLengthOfShortestSubarray(intArrayOf(5, 4, 3, 2, 1)),
            `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findLengthOfShortestSubarray(intArrayOf(1, 2, 3)),
            `is`(0)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.findLengthOfShortestSubarray(intArrayOf(1, 2, 3, 10, 0, 7, 8, 9)),
            `is`(2)
        )
    }
}