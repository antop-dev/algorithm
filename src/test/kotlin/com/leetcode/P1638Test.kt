package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1638Test {
    val p = P1638()

    @Test
    fun `example 01`() {
        assertThat(p.countSubstrings("aba", "baba"), `is`(6))
    }

    @Test
    fun `example 02`() {
        assertThat(p.countSubstrings("ab", "bb"), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.countSubstrings("a", "a"), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.countSubstrings("abe", "bbc"), `is`(10))
    }

    @Test
    fun `example 05`() {
        assertThat(p.countSubstrings("computer", "computation"), `is`(90))
    }

}
