package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P438Test {
    val sut = P438()

    @Test
    fun `example 1`() {
        assertThat(sut.findAnagrams("cbaebabacd", "abc"), `is`(listOf(0, 6)))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.findAnagrams("abab", "ab"), `is`(listOf(0, 1, 2)))
    }

}
