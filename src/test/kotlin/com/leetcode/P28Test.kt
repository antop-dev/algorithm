package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P28Test {
    val p = P28()

    @Test
    fun `example 1`() {
        assertEquals(2, p.strStr("hello", "ll"))
    }

    @Test
    fun `example 2`() {
        assertEquals(-1, p.strStr("aaaaa", "bba"))
    }

    @Test
    fun `example 3`() {
        assertEquals(4, p.strStr("mississippi", "issip"))
    }
}