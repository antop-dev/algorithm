package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P343Test {
    val p = P343()

    @Test
    fun `example 01`() {
        assertThat(p.integerBreak(2), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.integerBreak(10), `is`(36))
    }

    @Test
    fun `example 03`() {
        assertThat(p.integerBreak(3), `is`(2))
    }

    @Test
    fun `example 04`() {
        assertThat(p.integerBreak(4), `is`(4))
    }

    @Test
    fun `example 05`() {
        assertThat(p.integerBreak(5), `is`(6))
    }

    @Test
    fun `example 06`() {
        assertThat(p.integerBreak(6), `is`(9))
    }


    @Test
    fun `example 07`() {
        assertThat(p.integerBreak(7), `is`(12))
    }

    @Test
    fun `example 08`() {
        assertThat(p.integerBreak(8), `is`(18))
    }

    @Test
    fun `example 09`() {
        assertThat(p.integerBreak(9), `is`(27))
    }

    @Test
    fun `example 11`() {
        assertThat(p.integerBreak(11), `is`(54))
    }

    @Test
    fun `example 12`() {
        assertThat(p.integerBreak(12), `is`(81))
    }

    @Test
    fun `example 13`() {
        assertThat(p.integerBreak(13), `is`(108))
    }

    @Test
    fun `example 58`() {
        assertThat(p.integerBreak(58), `is`(1_549_681_956))
    }

}
