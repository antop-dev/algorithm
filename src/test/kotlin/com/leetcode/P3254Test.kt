package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3254Test {
    val sut = P3254()

    @Test
    fun `example 1`() {
        assertThat(
            sut.resultsArray(intArrayOf(1, 2, 3, 4, 3, 2, 5), 3),
            `is`(intArrayOf(3, 4, -1, -1, -1))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.resultsArray(intArrayOf(2, 2, 2, 2, 2), 4),
            `is`(intArrayOf(-1, -1))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.resultsArray(intArrayOf(3, 2, 3, 2, 3, 2), 2),
            `is`(intArrayOf(-1, 3, -1, 3, -1))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.resultsArray(intArrayOf(1), 1),
            `is`(intArrayOf(1))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.resultsArray(intArrayOf(1, 3, 4), 2),
            `is`(intArrayOf(-1, 4))
        )
    }

}
