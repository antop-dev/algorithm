package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P503Test {
    val sut = P503()

    @Test
    fun `example 1`() {
        assertThat(
            sut.nextGreaterElements(intArrayOf(1, 2, 1)),
            `is`(intArrayOf(2, -1, 2))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)),
            `is`(intArrayOf(2, 3, 4, -1, 4))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.nextGreaterElements(intArrayOf(1, 2, 3, 4, 1)),
            `is`(intArrayOf(2, 3, 4, -1, 2))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.nextGreaterElements(intArrayOf(1, 2, 3, 4, 2)),
            `is`(intArrayOf(2, 3, 4, -1, 3))
        )
    }

    @Test
    fun `example 5`() {
        assertThat(
            sut.nextGreaterElements(intArrayOf(2, 2, 2, 2)),
            `is`(intArrayOf(-1, -1, -1, -1))
        )
    }
}
