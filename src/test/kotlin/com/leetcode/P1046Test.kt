package com.leetcode

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

internal class P1046Test {
    val p = P1046()

    @Test
    fun `example 01`() {
        assertThat(p.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)), `is`(1))
    }

    @Test
    fun `example 02`() {
        assertThat(p.lastStoneWeight(intArrayOf(7, 6, 7, 6, 9)), `is`(3))
    }

    @Test
    fun `example 03`() {
        assertThat(p.lastStoneWeight(intArrayOf(2, 2)), `is`(0))
    }

}
