package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1529Test {
    val p = P1529()

    @Test
    fun `example 01`() {
        assertThat(p.minFlips("10111"), `is`(3))
    }

    @Test
    fun `example 02`() {
        assertThat(p.minFlips("101"), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.minFlips("00000"), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.minFlips("001011101"), `is`(5))
    }
}
