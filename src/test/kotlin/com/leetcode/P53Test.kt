package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P53Test {
    val p = P53()

    @Test
    fun `example 1`() {
        assertEquals(6, p.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun `example 2`() {
        assertEquals(1, p.maxSubArray(intArrayOf(1)))
    }

}