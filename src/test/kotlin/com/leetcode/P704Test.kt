package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/binary-search/
internal class P704Test {
    val p = P704()

    @Test
    fun `example 1`() {
        assertEquals(4, p.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    }

    @Test
    fun `example 2`() {
        assertEquals(-1, p.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }
}