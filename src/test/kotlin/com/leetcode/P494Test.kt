package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P494Test {
    val sut = P494()

    @Test
    fun `example 1`() {
        assertThat(sut.findTargetSumWays(intArrayOf(1, 1, 1, 1, 1), 3), `is`(5))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findTargetSumWays(intArrayOf(1), 1), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.findTargetSumWays(
                intArrayOf(
                    48,
                    9,
                    50,
                    48,
                    38,
                    34,
                    47,
                    8,
                    1,
                    44,
                    27,
                    42,
                    45,
                    25,
                    23,
                    40,
                    6,
                    39,
                    21,
                    48
                ), 29
            ), `is`(5045)
        )
    }

}
