package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P796Test {
    val p = P796()

    @Test
    fun `example 01`() {
        assertThat(p.rotateString("abcde", "cdeab"), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.rotateString("abcde", "abced"), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.rotateString("abcde", ""), `is`(false))
    }

    @Test
    fun `example 04`() {
        assertThat(p.rotateString("", ""), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(p.rotateString("abcde", "fghij"), `is`(false))
    }

    @Test
    fun `example 06`() {
        assertThat(p.rotateString("bbbacddceeb", "ceebbbbacdd"), `is`(true))
    }

}
