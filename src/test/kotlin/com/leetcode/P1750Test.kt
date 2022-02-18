package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1750Test {
    val p = P1750()

    @Test
    fun `example 01`() {
        assertThat(p.minimumLength("ca"), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minimumLength("aabccabba"), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"), `is`(1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minimumLength("cabaabac"), `is`(0))
    }

    @Test
    fun `example 05`() {
        assertThat(p.minimumLength("bbbbbbbbbbbbbbbbbbb"), `is`(0))
    }

}
