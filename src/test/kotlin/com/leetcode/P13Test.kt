package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P13Test {
    val p = P13()

    @Test
    fun `example 1`() {
        assertEquals(3, p.romanToInt("III"))
    }

    @Test
    fun `example 2`() {
        assertEquals(4, p.romanToInt("IV"))
    }

    @Test
    fun `example 3`() {
        assertEquals(9, p.romanToInt("IX"))
    }

    @Test
    fun `example 4`() {
        assertEquals(58, p.romanToInt("LVIII"))
    }

    @Test
    fun `example 5`() {
        assertEquals(1994, p.romanToInt("MCMXCIV"))
    }
}
