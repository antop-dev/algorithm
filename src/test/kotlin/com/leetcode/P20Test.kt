package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class P20Test {
    val p = P20()

    @Test
    fun `example 1`() {
        assertEquals(true, p.isValid("()"))
    }

    @Test
    fun `example 2`() {
        assertEquals(true, p.isValid("()[]{}"))
    }

    @Test
    fun `example 3`() {
        assertEquals(false, p.isValid("(]"))
    }

    @Test
    fun `example 4`() {
        assertEquals(false, p.isValid("([)]"))
    }

    @Test
    fun `example 5`() {
        assertEquals(true, p.isValid("{[]}"))
    }

    @Test
    fun `example 6`() {
        assertEquals(false, p.isValid("]"))
    }

}
