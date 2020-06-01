package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/string-compression/
internal class P443Test {
    val p = P443()

    @Test
    fun `example 1`() {
        val chars = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')
        val length = p.compress(chars)
        assertThat(length, `is`(6))
        assertThat(chars.copyOfRange(0, length), `is`(charArrayOf('a', '2', 'b', '2', 'c', '3')))
    }

    @Test
    fun `example 2`() {
        val chars = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')
        val length = p.compress(chars)
        assertThat(length, `is`(4))
        assertThat(chars.copyOfRange(0, length), `is`(charArrayOf('a', 'b', '1', '2')))
    }

    @Test
    fun `example 3`() {
        val chars = charArrayOf('a')
        val length = p.compress(chars)
        assertThat(length, `is`(1))
        assertThat(chars.copyOfRange(0, length), `is`(charArrayOf('a')))
    }

    @Test
    fun `example 4`() {
        val chars = charArrayOf('#', '$', '#', '#', '$', '$', '$', '$', '#', '#')
        val length = p.compress(chars)
        assertThat(length, `is`(8))
        assertThat(chars.copyOfRange(0, length), `is`(charArrayOf('#', '$', '#', '2', '$', '4', '#', '2')))
    }
}
