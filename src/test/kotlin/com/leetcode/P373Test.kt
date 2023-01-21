package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.junit.jupiter.api.Test

class P373Test {
    val sut = P373()

    @Test
    fun `example 1`() {
        assertThat(
            sut.kSmallestPairs(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3),
            containsInAnyOrder(listOf(1, 2), listOf(1, 4), listOf(1, 6))
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.kSmallestPairs(intArrayOf(1, 1, 2), intArrayOf(1, 2, 3), 2),
            containsInAnyOrder(listOf(1, 1), listOf(1, 1))
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.kSmallestPairs(intArrayOf(1, 2), intArrayOf(3), 3),
            containsInAnyOrder(listOf(1, 3), listOf(2, 3))
        )
    }

    @Test
    fun `example 4`() {
        assertThat(
            sut.kSmallestPairs(intArrayOf(1, 2, 4, 5, 6), intArrayOf(3, 5, 7, 9), 3),
            containsInAnyOrder(listOf(1, 3), listOf(2, 3), listOf(1, 5))
        )
    }

}
