package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P31Test {
    val sut = P31()

    @Test
    fun `example 1`() {
        valid(intArrayOf(1, 2, 3), intArrayOf(1, 3, 2))
    }

    @Test
    fun `example 2`() {
        valid(intArrayOf(3, 2, 1), intArrayOf(1, 2, 3))
    }

    @Test
    fun `example 3`() {
        valid(intArrayOf(1, 1, 5), intArrayOf(1, 5, 1))
    }

    @Test
    fun `example 4`() {
        valid(
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 9, 8)
        )
    }

    @Test
    fun `example 5`() {
        valid(
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 9, 8),
            intArrayOf(1, 2, 3, 4, 5, 6, 8, 7, 9)
        )
    }

    @Test
    fun `example 6`() {
        valid(
            intArrayOf(1, 2, 3, 4, 5, 6, 8, 7, 9),
            intArrayOf(1, 2, 3, 4, 5, 6, 8, 9, 7)
        )
    }

    private fun valid(problem: IntArray, answer: IntArray) {
        sut.nextPermutation(problem)
        assertThat(problem, `is`(answer))
    }

}
