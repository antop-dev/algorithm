package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P367Test {
    val p = P367()

    @Test
    fun `example 01`() {
        assertThat(p.isPerfectSquare(16), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.isPerfectSquare(14), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.isPerfectSquare(25), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.isPerfectSquare(9), `is`(true))
    }

    @Test
    fun `example 05`() {
        assertThat(p.isPerfectSquare(4), `is`(true))
    }

    @Test
    fun `example 06`() {
        assertThat(p.isPerfectSquare(808201), `is`(true))
    }

}
