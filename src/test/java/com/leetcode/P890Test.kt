package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P890Test {
    val p = P890()

    @Test
    fun `example 01`() {
        assertThat(
            p.findAndReplacePattern(arrayOf("abc", "deq", "mee", "aqq", "dkd", "ccc"), "abb"),
            `is`(listOf("mee", "aqq"))
        )
    }

    @Test
    fun `example 02`() {
        assertThat(
            p.findAndReplacePattern(arrayOf("a", "b", "c"), "a"),
            `is`(listOf("a", "b", "c"))
        )
    }

    @Test
    fun `example 03`() {
        assertThat(
            p.findAndReplacePattern(arrayOf("abc", "cba", "xyx", "yxx", "yyx"), "abc"),
            `is`(listOf("abc", "cba"))
        )
    }

    @Test
    fun `example 04`() {
        assertThat(
            p.findAndReplacePattern(arrayOf("abcdefghijklab", "abcdefghijkabl"), "abcdefghijklab"),
            `is`(listOf("abcdefghijklab"))
        )
    }

}
