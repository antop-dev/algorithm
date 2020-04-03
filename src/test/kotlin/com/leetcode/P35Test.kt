package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/search-insert-position/
internal class P35Test {
    val p = P35()

    @Test
    fun `example 1`() {
        assertEquals(2, p.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    }

    @Test
    fun `example 2`() {
        assertEquals(1, p.searchInsert(intArrayOf(1, 3, 5, 6), 2))
    }

    @Test
    fun `example 3`() {
        assertEquals(4, p.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }

    @Test
    fun `example 4`() {
        assertEquals(0, p.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }

    @Test
    fun `example 5`() {
        assertEquals(0, p.searchInsert(intArrayOf(1, 3), 0))
    }

    @Test
    fun `example 6`() {
        assertEquals(1, p.searchInsert(intArrayOf(1, 3), 2))
    }

    @Test
    fun `example 7`() {
        assertEquals(1, p.searchInsert(intArrayOf(1, 3, 5), 3))
    }

    @Test
    fun `example 8`() {
        assertEquals(5, p.searchInsert(intArrayOf(3, 5, 7, 9, 10), 11))
    }

    @Test
    fun `example 9`() {
        assertEquals(0, p.searchInsert(intArrayOf(1), 1))
    }
}