package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/is-subsequence/
internal class P392Test {
    val p = P392()

    @Test
    fun `example 1`() {
        assertEquals(true, p.isSubsequence("abc", "ahbgdc"))
    }

    @Test
    fun `example 2`() {
        assertEquals(false, p.isSubsequence("axc", "ahbgdc"))
    }

    @Test
    fun `example 3`() {
        assertEquals(false, p.isSubsequence("aec", "abcde"))
    }

    @Test
    fun `example 4`() {
        assertEquals(true, p.isSubsequence("", "ahbgdc"))
    }
}