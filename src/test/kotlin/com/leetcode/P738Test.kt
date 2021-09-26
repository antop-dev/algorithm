package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P738Test {
    val p = P738()

    @Test
    fun `example 01`() {
        assertThat(p.monotoneIncreasingDigits(10), `is`(9))
    }

    @Test
    fun `example 02`() {
        assertThat(p.monotoneIncreasingDigits(1234), `is`(1234))
    }

    @Test
    fun `example 03`() {
        assertThat(p.monotoneIncreasingDigits(332), `is`(299))
    }

    @Test
    fun `example 04`() {
        assertThat(p.monotoneIncreasingDigits(0), `is`(0))
    }

    @Test
    fun `example 05`() {
        assertThat(p.monotoneIncreasingDigits(9998), `is`(8999))
    }

    @Test
    fun `example 06`() {
        assertThat(p.monotoneIncreasingDigits(1230), `is`(1229))
    }

    @Test
    fun `example 07`() {
        assertThat(p.monotoneIncreasingDigits(100), `is`(99))
    }

}
