package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P58Test {
    val p = P58()

    @Test
    fun `example 1`() {
        assertEquals(5, p.lengthOfLastWord("Hello World"))
    }

    @Test
    fun `example 2`() {
        assertEquals(1, p.lengthOfLastWord("a "))
    }
}