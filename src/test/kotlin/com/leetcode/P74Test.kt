package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/search-a-2d-matrix/
internal class P74Test {
    val p = P74()

    @Test
    fun `example 1`() {
        assertEquals(true, p.searchMatrix(
                arrayOf(
                        intArrayOf(1, 3, 5, 7),
                        intArrayOf(10, 11, 16, 20),
                        intArrayOf(23, 30, 34, 50)),
                3))
    }

    @Test
    fun `example 2`() {
        assertEquals(false, p.searchMatrix(
                arrayOf(
                        intArrayOf(1, 3, 5, 7),
                        intArrayOf(10, 11, 16, 20),
                        intArrayOf(23, 30, 34, 50)),
                13))
    }

    @Test
    internal fun `example 3`() {
        assertEquals(false, p.searchMatrix(
                arrayOf(intArrayOf()),
                1))
    }
}