package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1014Test {
    val sut = P1014()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maxScoreSightseeingPair(intArrayOf(8, 1, 5, 2, 6)),
            `is`(11)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.maxScoreSightseeingPair(intArrayOf(1, 2)),
            `is`(2)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maxScoreSightseeingPair(intArrayOf(1, 3, 5)),
            `is`(7)
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.maxScoreSightseeingPair(intArrayOf(1, 2, 2)),
            `is`(3)
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.maxScoreSightseeingPair(intArrayOf(10, 4, 6, 4, 10)),
            `is`(16)
        )
    }


}