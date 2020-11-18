package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1624Test {
    val p = P1624()

    @Test
    fun `example 01`() {
        assertThat(p.maxLengthBetweenEqualCharacters("aa"), `is`(0))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxLengthBetweenEqualCharacters("abca"), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.maxLengthBetweenEqualCharacters("cbzxy"), `is`(-1))
    }

    @Test
    fun `example 04`() {
        assertThat(p.maxLengthBetweenEqualCharacters("cabbac"), `is`(4))
    }
}
