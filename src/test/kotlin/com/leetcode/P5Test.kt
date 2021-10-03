package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.anyOf
import org.junit.jupiter.api.Test

class P5Test {
    val p = P5()

    @Test
    fun `example 01`() {
        assertThat(p.longestPalindrome("babad"), anyOf(`is`("bab"), `is`("aba")))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestPalindrome("cbbd"), `is`("bb"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.longestPalindrome("a"), `is`("a"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.longestPalindrome("ac"), anyOf(`is`("a"), `is`("c")))
    }

    @Test
    fun `example 05`() {
        assertThat(p.longestPalindrome("aaaaa"), `is`("aaaaa"))
    }

}
