package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2161Test {
    val sut = P2161()

    @Test
    fun `example 1`() {
        assertThat(
            sut.pivotArray(intArrayOf(9, 12, 5, 10, 14, 3, 10), 10),
            `is`(intArrayOf(9, 5, 3, 10, 10, 12, 14))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.pivotArray(intArrayOf(-3, 4, 3, 2), 2),
            `is`(intArrayOf(-3, 2, 4, 3))
        )
    }
}
