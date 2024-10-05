package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class P2087Test {
    val sut = P2087()

    @Test
    fun `example 1`() {
        val startPos = intArrayOf(1, 0)
        val homePos = intArrayOf(2, 3)
        val rowCosts = intArrayOf(5, 4, 3)
        val colCosts = intArrayOf(8, 2, 6, 7)
        assertThat(sut.minCost(startPos, homePos, rowCosts, colCosts), `is`(18))
    }

    @Test
    fun `example 2`() {
        val startPos = intArrayOf(0, 0)
        val homePos = intArrayOf(0, 0)
        val rowCosts = intArrayOf(5)
        val colCosts = intArrayOf(26)
        assertThat(sut.minCost(startPos, homePos, rowCosts, colCosts), `is`(0))
    }
}
