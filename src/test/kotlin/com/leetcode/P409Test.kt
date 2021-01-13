package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P409Test {
    val p = P409()

    @Test
    fun `example 01`() {
        assertThat(p.longestPalindrome("abccccdd"), `is`(7))
    }

    @Test
    fun `example 02`() {
        assertThat(p.longestPalindrome("a"), `is`(1))
    }

    @Test
    fun `example 03`() {
        assertThat(p.longestPalindrome("bb"), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(p.longestPalindrome("ccc"), `is`(3))
    }

}
