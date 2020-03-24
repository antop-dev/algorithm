package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
internal class P84Test {
    val p = P84()

    @Test
    fun `example 1`() {
        assertEquals(10, p.largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)))
    }

    @Test
    fun `example 2`() {
        assertEquals(1, p.largestRectangleArea(intArrayOf(1)))
    }

    @Test
    fun `example 3`() {
        assertEquals(9, p.largestRectangleArea(intArrayOf(0, 9)))
    }
}