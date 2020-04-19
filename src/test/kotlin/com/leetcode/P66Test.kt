package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class P66Test {
    val p = P66()

    @Test
    fun `example 1`() {
        assertArrayEquals(intArrayOf(1, 2, 4), p.plusOne(intArrayOf(1, 2, 3)))
    }

    @Test
    fun `example 2`() {
        assertArrayEquals(intArrayOf(4, 3, 2, 2), p.plusOne(intArrayOf(4, 3, 2, 1)))
    }

    @Test
    fun `example 3`() {
        assertArrayEquals(intArrayOf(1, 0, 0), p.plusOne(intArrayOf(9, 9)))
    }
}