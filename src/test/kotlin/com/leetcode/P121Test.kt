package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P121Test {
    val p = P121()

    @Test
    fun `example 01`() {
        assertThat(p.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)), `is`(5))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxProfit(intArrayOf(7, 6, 4, 3, 1)), `is`(0))
    }

    @Test
    fun `example 03`() {
        assertThat(p.maxProfit(IntArray(0)), `is`(0))
    }

    @Test
    fun `example 04`() {
        assertThat(p.maxProfit(intArrayOf(2, 4, 1)), `is`(2))
    }
}
