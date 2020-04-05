package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
internal class P1011Test {
    val p = P1011()

    @Test
    fun `example 1`() {
        assertEquals(15, p.shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    }

    @Test
    fun `example 2`() {
        assertEquals(6, p.shipWithinDays(intArrayOf(3, 2, 2, 4, 1, 4), 3))
    }

    @Test
    fun `example 3`() {
        assertEquals(3, p.shipWithinDays(intArrayOf(1, 2, 3, 1, 1), 4))
    }

    @Test
    fun `example 4`() {
        assertEquals(160, p.shipWithinDays(intArrayOf(10, 50, 100, 100, 50, 100, 100, 100), 5))
    }

}