package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1502Test {
    val p = P1502()

    @Test
    fun `example 01`() {
        assertThat(p.canMakeArithmeticProgression(intArrayOf(3, 5, 1)), `is`(true))
    }

    @Test
    fun `example 02`() {
        assertThat(p.canMakeArithmeticProgression(intArrayOf(1, 2, 4)), `is`(false))
    }

    @Test
    fun `example 03`() {
        assertThat(p.canMakeArithmeticProgression(intArrayOf(1, 100)), `is`(true))
    }

    @Test
    fun `example 04`() {
        assertThat(p.canMakeArithmeticProgression(intArrayOf(-68, -96, -12, -40, 16)), `is`(true))
    }
}
