package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.Matchers.empty
import org.junit.jupiter.api.Test

class P3310Test {
    val sut = P3310()

    @Test
    fun `example 1`() {
        val invocations = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(0, 1),
            intArrayOf(3, 2),
        )
        assertThat(
            sut.remainingMethods(4, 1, invocations),
            containsInAnyOrder(0, 1, 2, 3)
        )
    }

    @Test
    fun `example 2`() {
        val invocations = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(0, 2),
            intArrayOf(0, 1),
            intArrayOf(3, 4),
        )
        assertThat(
            sut.remainingMethods(5, 0, invocations),
            containsInAnyOrder(3, 4)
        )
    }

    @Test
    fun `example 3`() {
        val invocations = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(0, 1),
            intArrayOf(2, 0),
        )
        assertThat(
            sut.remainingMethods(3, 2, invocations),
            empty()
        )
    }

    @Test
    fun `example 4`() {
        val invocations = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(0, 1),
            intArrayOf(3, 2),
            intArrayOf(4, 0),
        )
        assertThat(
            sut.remainingMethods(5, 1, invocations),
            containsInAnyOrder(0, 1, 2, 3, 4)
        )
    }

    @Test
    fun `example 5`() {
        val invocations = arrayOf<IntArray>()
        assertThat(
            sut.remainingMethods(3, 0, invocations),
            containsInAnyOrder(1, 2)
        )
    }
}
