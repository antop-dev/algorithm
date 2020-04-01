package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/heaters/
internal class P475Test {
    val p = P475()

    @Test
    fun `example 1`() {
        assertEquals(1, p.findRadius(intArrayOf(1, 2, 3), intArrayOf(2)))
    }

    @Test
    fun `example 2`() {
        assertEquals(1, p.findRadius(intArrayOf(1, 2, 3, 4), intArrayOf(1, 4)))
    }

    @Test
    fun `example 3`() {
        assertEquals(3, p.findRadius(intArrayOf(1, 5), intArrayOf(2)))
    }

    @Test
    fun `example 4`() {
        assertEquals(0, p.findRadius(intArrayOf(1), intArrayOf(1, 2, 3, 4)))
    }

}