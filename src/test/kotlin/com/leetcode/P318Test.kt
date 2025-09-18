package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P318Test {
    val sut = P318()

    @Test
    fun `example 1`() {
        assertThat(
            sut.maxProduct(arrayOf("abcw", "baz", "foo", "bar", "xtfn", "abcdef")),
            `is`(16)
        )
    }

    @Test
    fun `example 2`() {
        assertThat(
            sut.maxProduct(arrayOf("a", "ab", "abc", "d", "cd", "bcd", "abcd")),
            `is`(4)
        )
    }

    @Test
    fun `example 3`() {
        assertThat(
            sut.maxProduct(arrayOf("a", "aa", "aaa", "aaaa")),
            `is`(0)
        )
    }
}