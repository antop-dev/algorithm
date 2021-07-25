package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

class P12Test {
    val p = P12()

    @Test
    fun `example 01`() {
        assertThat(p.intToRoman(3), Matchers.`is`("III"))
    }

    @Test
    fun `example 02`() {
        assertThat(p.intToRoman(4), Matchers.`is`("IV"))
    }

    @Test
    fun `example 03`() {
        assertThat(p.intToRoman(9), Matchers.`is`("IX"))
    }

    @Test
    fun `example 04`() {
        assertThat(p.intToRoman(58), Matchers.`is`("LVIII"))
    }

    @Test
    fun `example 05`() {
        assertThat(p.intToRoman(3000), Matchers.`is`("MMM"))
    }

    @Test
    fun `example 06`() {
        assertThat(p.intToRoman(3999), Matchers.`is`("MMMCMXCIX"))
    }

}
