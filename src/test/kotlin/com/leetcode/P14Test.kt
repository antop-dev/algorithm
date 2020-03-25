package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
internal class P14Test {
    val p = P14()

    @Test
    fun `example 1`() {
        assertEquals("fl", p.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun `example 2`() {
        assertEquals("", p.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }

    @Test
    fun `example 3`() {
        assertEquals("", p.longestCommonPrefix(arrayOf("")))
    }

    @Test
    fun `example 4`() {
        assertEquals("", p.longestCommonPrefix(arrayOf("", "b")))
    }

    @Test
    fun `example 5`() {
        assertEquals("c", p.longestCommonPrefix(arrayOf("c", "c")))
    }

    @Test
    fun `example 6`() {
        assertEquals("a", p.longestCommonPrefix(arrayOf("aa", "a")))
    }
}