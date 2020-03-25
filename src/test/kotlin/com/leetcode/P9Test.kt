package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P9Test {
    val p = P9()

    @Test
    fun `example 1`() {
        assertEquals(true, p.isPalindrome(121))
    }

    @Test
    fun `example 2`() {
        assertEquals(false, p.isPalindrome(-121))
    }

    @Test
    fun `example 3`() {
        assertEquals(false, p.isPalindrome(10))
    }
}