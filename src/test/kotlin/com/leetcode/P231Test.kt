package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P231Test {
    val p = P231()

    @Test
    fun `example 01`() {
        assertThat(p.isPowerOfTwo(1), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isPowerOfTwo(16), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.isPowerOfTwo(218), `is`(false))
    }

    @Test
    fun `example 05`() {
        assertThat(p.isPowerOfTwo(5), `is`(false))
    }

    @Test
    fun `example 06`() {
        assertThat(p.isPowerOfTwo(0), `is`(false))
    }
}
