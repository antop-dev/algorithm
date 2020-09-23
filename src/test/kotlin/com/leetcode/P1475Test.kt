package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1475Test {
    val p = P1475()

    @Test
    fun `example 01`() {
        assertThat(p.finalPrices(intArrayOf(8, 4, 6, 2, 3)), `is`(intArrayOf(4, 2, 4, 2, 3)))
    }

    @Test
    fun `example 02`() {
        assertThat(p.finalPrices(intArrayOf(1, 2, 3, 4, 5)), `is`(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun `example 03`() {
        assertThat(p.finalPrices(intArrayOf(10, 1, 1, 6)), `is`(intArrayOf(9, 0, 1, 6)))
    }
}
