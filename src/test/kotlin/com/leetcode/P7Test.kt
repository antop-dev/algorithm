package com.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
internal class P7Test {
    val p = P7()

    @Test
    fun `example 1`() {
        assertEquals(321, p.reverse(123))
    }

    @Test
    fun `example 2`() {
        assertEquals(-123, p.reverse(-321))
    }

    @Test
    fun `example 3`() {
        assertEquals(21, p.reverse(120))
    }

    @Test
    fun `example 4`() {
        assertEquals(0, p.reverse(1534236469))
    }

}