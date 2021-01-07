package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class P228Test {
    val p = P228()

    @Test
    fun `example 01`() {
        assertEquals(p.summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)), listOf("0->2", "4->5", "7"))
    }

    @Test
    fun `example 02`() {
        assertEquals(p.summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)), listOf("0", "2->4", "6", "8->9"))
    }

    @Test
    fun `example 03`() {
        assertEquals(p.summaryRanges(intArrayOf()), listOf<String>())
    }

    @Test
    fun `example 04`() {
        assertEquals(p.summaryRanges(intArrayOf(-1)), listOf("-1"))
    }

    @Test
    fun `example 05`() {
        assertEquals(p.summaryRanges(intArrayOf(0)), listOf("0"))
    }

    @Test
    fun `example 06`() {
        assertEquals(
            p.summaryRanges(intArrayOf(-2147483648, -2147483647, 2147483647)),
            listOf("-2147483648->-2147483647", "2147483647")
        )
    }

}
