package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P3Test {
    val sut = P3()

    @Test
    fun `example 1`() {
        assertThat(sut.lengthOfLongestSubstring("abcabcbb"), `is`(3))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.lengthOfLongestSubstring("bbbbb"), `is`(1))
    }

    @Test
    fun `example 3`() {
        assertThat(sut.lengthOfLongestSubstring("pwwkew"), `is`(3))
    }

    @Test
    fun `example 4`() {
        assertThat(sut.lengthOfLongestSubstring("aaaaazxc"), `is`(4))
    }

    @Test
    fun `example 5`() {
        assertThat(sut.lengthOfLongestSubstring("abba"), `is`(2))
    }

}
