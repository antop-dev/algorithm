package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P344Test {
    val p = P344()

    @Test
    fun `example 01`() {
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        p.reverseString(s)
        assertThat(s, `is`(charArrayOf('o', 'l', 'l', 'e', 'h')))
    }

    @Test
    fun `example 02`() {
        val s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        p.reverseString(s)
        assertThat(s, `is`(charArrayOf('h', 'a', 'n', 'n', 'a', 'H')))
    }
}
