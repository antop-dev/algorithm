package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P991Test {
    private val p = P991()

    @Test
    fun `example 01`() {
        assertThat(p.brokenCalc(2, 3), `is`(2))
    }

    @Test
    fun `example 02`() {
        assertThat(p.brokenCalc(5, 8), `is`(2))
    }

    @Test
    fun `example 03`() {
        assertThat(p.brokenCalc(3, 10), `is`(3))
    }

    @Test
    fun `example 04`() {
        assertThat(p.brokenCalc(1, 1000000000), `is`(39))
    }
}
