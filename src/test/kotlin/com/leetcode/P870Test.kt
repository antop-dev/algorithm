package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P870Test {
    val sut = P870()

    @Test
    fun `example 1`() {
        assertThat(
            sut.advantageCount(
                intArrayOf(2, 7, 11, 15),
                intArrayOf(1, 10, 4, 11)
            ),
            `is`(intArrayOf(2, 11, 7, 15))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.advantageCount(
                intArrayOf(12, 24, 8, 32),
                intArrayOf(13, 25, 32, 11)
            ),
            `is`(intArrayOf(24, 32, 8, 12))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.advantageCount(
                intArrayOf(9, 1, 2, 4, 5),
                intArrayOf(6, 2, 9, 1, 4)
            ),
            `is`(intArrayOf(9, 4, 1, 2, 5))
        )
    }
}
