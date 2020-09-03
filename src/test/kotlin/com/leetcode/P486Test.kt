package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P486Test {
    val p = P486()

    @Test
    fun `example 01`() {
        assertThat(p.PredictTheWinner(intArrayOf(1, 5, 2)), `is`(false))
    }

    @Test
    fun `example 02`() {
        assertThat(p.PredictTheWinner(intArrayOf(1, 5, 233, 7)), `is`(true))
    }

    @Test
    fun `example 03`() {
        assertThat(p.PredictTheWinner(intArrayOf(2, 4, 55, 6, 8)), `is`(false))
    }
}
