package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2396Test {
    val sut = P2396()

    @Test
    fun `example 1`() {
        assertThat(sut.isStrictlyPalindromic(9), `is`(false))
    }

    @Test
    fun `example 2`() {
        assertThat(sut.isStrictlyPalindromic(4), `is`(false))
    }

}
