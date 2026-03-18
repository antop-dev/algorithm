package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1143Test {
    private val sut = P1143()

    @Test
    fun `example 1`() {
        assertThat(sut.longestCommonSubsequence("abcde", "ace"), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.longestCommonSubsequence("abc", "abc"), `is`(3))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.longestCommonSubsequence("abc", "def"), `is`(0))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.longestCommonSubsequence("bsbininm", "jmjkbkjkv"), `is`(1))
    }
}
