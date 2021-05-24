package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P1641Test {
    val p = P1641()

    @Test
    fun `example 01`() {
        assertThat(p.countVowelStrings(1), `is`(5))
    }

    @Test
    fun `example 02`() {
        assertThat(p.countVowelStrings(2), `is`(15))
    }

    @Test
    fun `example 03`() {
        assertThat(p.countVowelStrings(3), `is`(35))
    }

    @Test
    fun `example 04`() {
        assertThat(p.countVowelStrings(4), `is`(70))
    }

    @Test
    fun `example 05`() {
        assertThat(p.countVowelStrings(5), `is`(126))
    }

    @Test
    fun `example 06`() {
        assertThat(p.countVowelStrings(6), `is`(210))
    }

    @Test
    fun `example 07`() {
        assertThat(p.countVowelStrings(7), `is`(330))
    }

    @Test
    fun `example 08`() {
        assertThat(p.countVowelStrings(8), `is`(495))
    }

    @Test
    fun `example 09`() {
        assertThat(p.countVowelStrings(9), `is`(715))
    }

    @Test
    fun `example 10`() {
        assertThat(p.countVowelStrings(10), `is`(1001))
    }

    @Test
    fun `example 33`() {
        assertThat(p.countVowelStrings(33), `is`(66045))
    }

    @Test
    fun `example 49`() {
        assertThat(p.countVowelStrings(49), `is`(292825))
    }

    @Test
    fun `example 50`() {
        assertThat(p.countVowelStrings(50), `is`(316251))
    }

}
