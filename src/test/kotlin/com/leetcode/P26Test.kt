package com.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class P26Test {
    val p = P26()

    @Test
    fun `example 1`() {
        val nums = intArrayOf(1, 1, 2)
        val expected = 2

        assertEquals(expected, p.removeDuplicates(nums))
        assertArrayEquals(intArrayOf(1, 2), nums.sliceArray(IntRange(0, expected - 1)))
    }

    @Test
    fun `example 2`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expected = 5

        assertEquals(expected, p.removeDuplicates(nums))
        assertArrayEquals(intArrayOf(0, 1, 2, 3, 4), nums.sliceArray(IntRange(0, expected - 1)))
    }

}
