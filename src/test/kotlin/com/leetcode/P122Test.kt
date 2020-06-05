package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P122Test {
    val p = P122()

    @Test
    fun `example 01`() {
        assertThat(p.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)), `is`(7))
    }

    @Test
    fun `example 02`() {
        assertThat(p.maxProfit(intArrayOf(1, 2, 3, 4, 5)), `is`(4))
    }

    @Test
    fun `example 03`() {
        assertThat(p.maxProfit(intArrayOf(7, 6, 4, 3, 1)), `is`(0))
    }
}
